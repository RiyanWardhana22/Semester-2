from flask import Flask, render_template, request, jsonify
import numpy as np
import tensorflow as tf

app = Flask(__name__)

# Load models
model_or = tf.keras.models.load_model('models/or_model.h5')
model_and = tf.keras.models.load_model('models/and_model.h5')
model_and_not = tf.keras.models.load_model('models/and_not_model.h5')

def predict_gate(model, inputs):
    inputs = np.array(inputs, dtype=np.float32).reshape(1, -1)
    prediction = model.predict(inputs)
    return int(prediction[0][0] > 0.5)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/predict', methods=['POST'])
def predict():
    data = request.json
    gate = data['gate']
    inputs = [data['input1'], data['input2']]
    
    if gate == 'OR':
        result = predict_gate(model_or, inputs)
    elif gate == 'AND':
        result = predict_gate(model_and, inputs)
    elif gate == 'AND_NOT':
        result = predict_gate(model_and_not, inputs)
    else:
        result = None

    return jsonify({'result': result})

if __name__ == '__main__':
    app.run(debug=True)
