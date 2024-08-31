    //Print methods
    
    document.write("Hello JavaScript in JS browser.");
    console.log("Hello JavaScript in JS console.");

    //Variable type 1 (var)

    var a = 20;
    console.log(a);
    document.write("<br><br>var variable<br>"+a);
    var a = 30;
    console.log(a);
    document.write("<br>"+a);
    a = 40;
    console.log(a);
    document.write("<br>"+a+"<br>");

    //Variable type 2 (let)

    let b = 20;
    console.log(b);
    document.write("let variable<br>"+b);
    //let b = 30;
    //console.log(b);
    //document.write("<br>"+b);
    b = 40;
    console.log(b);
    document.write("<br>"+b);

    //Variable type 3 (const)

    const c = 20;
    console.log(c);
    document.write("<br>const variable<br>"+c);
    //const c = 30;
    //console.log(c);
    //document.write("<br>"+bc;
    //c = 40;
    //console.log(c);
    //document.write("<br>"+c);

    document.write("<br><br>Variable datatype:-<br>");
    console.log(typeof a);document.write("\n"+a+"<br>\n");
    a="Name";
    console.log(typeof a);document.write("\n"+a+"<br>");
    a=["HTML","CSS","JS"];
    console.log(typeof a);document.write("\n"+a+"<br>");
    a={first:"tom",last:"jerry"};
    console.log(typeof a);document.write("\n"+a+"<br>");
    var e=null;
    console.log(typeof e);document.write("\n"+e+"<br>");
    var d;
    console.log(typeof d);document.write("\n"+d+"<br>");
    a=true
    console.log(typeof a);document.write("\n"+a+"<br>");

console.time("test")
console.error("Something went wrong.")
console.warn("This is just warning.")
console.timeEnd("test")
//console.clear()