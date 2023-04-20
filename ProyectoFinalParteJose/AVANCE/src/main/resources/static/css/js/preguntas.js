(function(){
    const titlepreguntas = [...document.querySelectorAll('.titulo_preguntas')];
    console.log(titlepreguntas)

    titlepreguntas.forEach(question =>{
        question.addEventListener('click', ()=>{
            let height = 0;
            let answer = question.nextElementSibling;
            let addPadding = question.parentElement.parentElement;

            addPadding.classList.toggle('preguntas__p--add');
            question.children[0].classList.toggle('flecha--rotate');

            if(answer.clientHeight === 0){
                height = answer.scrollHeight;
            }

            answer.style.height = `${height}px`;
        });
    });
})();

