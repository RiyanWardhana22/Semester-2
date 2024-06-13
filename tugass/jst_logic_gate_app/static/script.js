document
  .getElementById("logicGateForm")
  .addEventListener("submit", function (event) {
    event.preventDefault();
    const gate = document.getElementById("gate").value;
    const input1 = parseInt(document.getElementById("input1").value);
    const input2 = parseInt(document.getElementById("input2").value);
    fetch("/predict", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        gate: gate,
        input1: input1,
        input2: input2,
      }),
    })
      .then((response) => response.json())
      .then((data) => {
        document.getElementById("resultValue").textContent = data.result;
      });
  });
