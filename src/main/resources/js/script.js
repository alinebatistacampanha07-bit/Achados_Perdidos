package js;

// Efeito de transição ao clicar em "Próximo"
document.addEventListener("DOMContentLoaded", function() {
    const botaoProximo = document.querySelector("button");
    if (botaoProximo) {
        botaoProximo.addEventListener("click", function() {
            document.body.classList.add("fade-out");
            setTimeout(() => {
                window.location.href = "/objetos";
            }, 500); // meio segundo de transição
        });
    }
});

