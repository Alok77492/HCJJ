/* beforebegin
const h1=document.createElement('h1')
h1.textContent="Learning JavaScript"

const para=document.createElement('p')
para.textContent="By Shresth Rajput"


const div=document.getElementById('tag')

div.insertAdjacentElement("beforebegin", h1)
div.insertAdjacentElement("beforebegin",para) */

/* afterend

const para1=document.createElement('p');
const para2=document.createElement('p');
para1.textContent="For Better Experience switch to 1.5x"
para2.textContent="Like,Share and Subscribe.."

const div=document.getElementById('tag')

div.insertAdjacentElement("afterend",para2)
div.insertAdjacentElement("afterend",para1)

*/

/*afterbegin 
const p1=document.createElement('p')
p1.textContent="Direct Child-1"

const div=document.getElementById('tag')
div.insertAdjacentElement("afterbegin",p1)

*/

// Traversing

/*const ptag=document.querySelector('p')
ptag.parentElement.style.backgrounColor="black";
ptag.parentElement.style.color="white";
ptag.parentElement.style.cssText="background-color:red; color:white; font-size:24px;"
*/

//const ptag=document.querySelector('main')
//ptag.parentElement.style.cssText="background-color:aqua; color:white; font-size:24px;"


//const ptag=document.querySelector('section>: last-child')
//ptag.parentElement.style.cssText="background-color:aqua; color:white; font-size:24px;"

//first child child
/*
const section=document.querySelector('section')
console.log(section.firstElementChild)

//last element child
console.log(section.lastElementChild)

//next element sibling
console.log(section.firstElementChild.nextElementSibling)

//previous element child
console.log(section.lastElementChild.previousElementSibling)


//children
const section=document.querySelector('section')
//console.log(section.children[3])

console.log(section.children[3]).style.cssText="background-color:black;color:aqua;"


const section=document.querySelector('section')
//console.log(section.childNodes)




const section=document.querySelector('section')
section.children[2].style.cssText="background-color:black;color:white;"
section.children[4].style.cssText="background-color:black;color:white;"
*/

const section=document.querySelector('section')
for (let i = 0; i < section.children.length; i++) {
   if(i%2!==0)
       {
            section.children[i].style.cssText="color:orange;"
        }  
        else{
            section.children[i].style.cssText="color:aqua;"
        }
}


/*
        const section=document.querySelector('section')
        //const remove=section.children[3]
        section.children[3].remove()
        //section.removeChild(remove)
        section.children[2].remove()  //position get changed after removing
        section.children[3].remove()  //position get changed after removing


//set attributes("id","chomu")
//set attributes("class","chomi")

const section=document.querySelector('section')
section.setAttribute("id","parent")
section.setAttribute('class','box')

removeAttribute("class")
*/