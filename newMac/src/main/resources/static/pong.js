const canvas = document.getElementById("pong");
canvas.getContext("2d");

//This draws a rectangle
context.fillStyle = "black";
//draws the thing
context.fillRect(100, 200, 50, 75);


//draws a red circle
context.fillStyle = "red";
context.beginPath();
context.arc(300,350, 100, 0, Math.PI*2, false);
context.closePath();
context.fill();



//Function that draws a colored rectangle, look at your static information to make your active functions
function drawRect(x,y,w,h,color){
    ctx.fillStyle = color;
    ctx.fillRect(x,y,w,h);
}

//Function that draws a colored circle


