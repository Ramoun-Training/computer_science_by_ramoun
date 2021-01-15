const root = document.querySelector(":root");
const themeBtn = document.querySelector("#theme");
const themesContainer = document.querySelector("#themes");
const themesBtns = themesContainer.querySelectorAll("li");


function changeThemeBtnStyle () {
    if (themesContainer.style.display == "flex") {
        setTimeout(function(){
            themesContainer.style.transform = "scaleX(0) translateX(-100px)";
            //do what you need here
        }, 500);
        setTimeout(function(){
            themesContainer.style.display = "none";
        }, 1000);
    } else {       
        themesContainer.style.display = "flex";
        setTimeout(function(){
            themesContainer.style.transform = "scaleX(1) translateX(0)";
            //do what you need here
        }, 100);   
    }
}

function addListeners () {    
    themeBtn.onclick = changeThemeBtnStyle;

    for (let i = 0; i < themesBtns.length; i++) {
        const element = themesBtns[i];
        element.onclick = () => {
            element.innerHTML = "<i class=\"fas fa-check\"></i>";
            console.log(element.getAttribute("style"));
            for (let j = 0; j < themesBtns.length; j++) {
                const otherElement = themesBtns[j];
                if (!(element == otherElement)) {
                    otherElement.innerHTML = "";
                }
            }
            root.setAttribute("style", element.getAttribute("style"));
        };
    }
}

window.onload = addListeners;