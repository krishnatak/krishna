// getting value from textarea
const myinput = document.getElementById("mytext");



// formula to get value in letter/sec
//this function will be call when we submit form
function speedResult() {
    
    
    var myText = document.querySelector("#mytext").value;

    var speed= myText.length/15 ;
    
    var displayResult= "Your typing speed is "+speed+ " letters per seconds";
    
    // to print the result on screen
    document.getElementById("displayResult").innerHTML= displayResult ;
}


// funcxtion to submit the form automatically after 15 sec

var x = 0;
function autoSubmit(){


x = window.setTimeout(speedResult,16000);
 
    countDown();
}
 //autoSubmit();

   function Call()
    {
    alert("Me");
    }





 //countdown
var countdown = 15;

function startTime(){
    
   if(countdown>=0){
       document.getElementById("timer").innerHTML=countdown+" seconds left";
    countdown--;   
    }
   
}

// to start countdown
var y = 0;

function countDown(){
    y = window.setInterval(startTime,1000);
}

//countDown();

//myinput.addEventListener("keypress",countDown,false);
//myinput.addEventListener("keypress",autoSubmit,false);



