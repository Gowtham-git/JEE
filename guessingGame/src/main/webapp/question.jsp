<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personality</title>
<style>

@font-face {
font-family: 'Averia Serif Libre', cursive;
url:'https://fonts.googleapis.com/css2?family=Averia+Serif+Libre:wght@300&display=swap';
}
body{
background-image:radial-gradient(circle,rgba(0,0,10,0.8),rgba(0,0,10,0.9));
display:grid;
place-items:center;
min-height:100vh;
color:#FFEBA0;
font-size:1rem;
}

body::after{
position:absolute;
content:"";
top:0;
left:0;
width:100%;
height:100%;
background-image:linear-gradient(#53F7A2,#CAF2FF);
clip-path:circle(10% at 0% 0%);
animation:ball-after 8s linear infinite ;
backdrop-filter:blur(20px);
z-index:1;
}

@keyframes ball-after{
33%{
clip-path:circle(10% at 30% 50%);
z-index:-1;
}
66%{
clip-path:circle(10% at 0% 100%);
z-index:-1;
}
100%{
clip-path:circle(10% at 0% 0%);
z-index:-1;
}

}

body::before{
position:absolute;
content:"";
bottom:0;
right:0;
width:100%;
height:100%;
background-image:linear-gradient(#DB6CFD,#A683E2);
clip-path:circle(10% at 100% 90%);
animation:ball-before 8s linear infinite 3s ;
z-index:-1;
backdrop-filter:blur(20px);
}

@keyframes ball-before{
33%{
clip-path:circle(10% at 70% 50%);
z-index:-1;
}
66%{
clip-path:circle(10% at 100% 0%);
z-index:-1;
}
100%{
clip-path:circle(10% at 100% 90%);
z-index:-1;
}

}



#submit{
background-color:rgba(202,256,236,1);
margin:0 0 0 12rem;
width:6rem;
height:2rem;
font-size:1rem;
border-radius:0.4rem;
}
/*.glass{
background-color:rgba(0,0,0,0.5);
width:100%;
height:80%;
display:flex;
justify-content:center;
align-content: space-around;
}*/

.f{
position:relative;
width:30rem;
height:6rem;
display:flex;
border-radius:1rem;
justify-content:center;
flex-direction:column;
margin:0 0 3rem 0 ;
background-color:rgba(250,250,250,0.1);
z-index:100;
box-shadow:0.4rem 0.4rem 1rem rgba(255,255,255,0.2);
border-top:0.05rem solid rgba(255,255,255,0.6);
border-left:0.05rem solid rgba(255,255,255,0.6);
}

.f::after{
position:absolute;
content:"";
width:4rem;
height:4rem;
background-color:rgba(0,0,0,0.5);
//padding:4rem 0 0 0 ;
top:65%;
right:-6%;
z-index:-1;
border-radius:0.5rem;
transition:transform 1s;
}

.f::before{
position:absolute;
content:"";
width:4rem;
height:4rem;
background-color:rgba(0,0,0,0.5);
//padding:4rem 0 0 0 ;
bottom:65%;
left:-6%;
z-index:10;
border-radius:0.5rem;
transition:transform 1s;

}

.f:hover::before{
animation:first-1 2s linear infinite  ;
}


@keyframes first-1{

50%{
transform:translateY(25%) rotateZ(10deg);
background-color:rgba(55, 58, 230,0.4);
box-shadow:0.3rem 0.3rem 0.5rem rgba(55, 58, 230,0.4);
z-index:-1;

}
100%{
transform:translateY(0%) rotateZ(0deg);
z-index:-1;
}
}

.f:hover::after{
animation:first-2 2s linear infinite  ;
}

@keyframes first-2{

50%{
transform:translateY(-25%) rotateZ(10deg);
background-color:rgba(55, 58, 230,0.4);
box-shadow:0.3rem 0.3rem 0.5rem rgba(55, 58, 230,0.4);
}
100%{
transform:translateY(0%) rotateZ(0deg);
}
}



.f:hover{
background-color:rgba(0,0,0,0.5);
}
.s:hover{
background-color:rgba(0,0,0,0.5);
}
.t:hover{
background-color:rgba(0,0,0,0.5);
}



.first{
  display:flex;
  align-self: center;
  }
  .r-1{
  display:flex;
  flex-direction:row;
  align-self: center;
  padding:0 0 1rem 0 ;
  }
  
  .s{
position:relative;
width:30rem;
height:6rem;
display:flex;
background-color:rgba(250,250,250,0.1);
border-radius:1rem;
justify-content:center;
flex-direction:column;
margin:0 0 3rem 0 ;
backdrop-filter:blur(20px);
box-shadow:0.4rem 0.4rem 1rem rgba(255,255,255,0.2);
border-top:0.05rem solid rgba(255,255,255,0.6);
border-left:0.05rem solid rgba(255,255,255,0.6);
z-index:100;
}
.second{
  display:flex;
  align-self: center;
  }
  .r-2{
  display:flex;
  flex-direction:row;
  align-self: center;
  padding:0 0 1rem 0 ;
  }
  

  
.s::after{
position:absolute;
content:"";
width:4rem;
height:4rem;
background-color:rgba(0,0,0,0.5);
//padding:4rem 0 0 0 ;
top:65%;
right:-6%;
z-index:-1;
border-radius:0.5rem;
transition:transform 1s;
}

.s::before{
position:absolute;
content:"";
width:4rem;
height:4rem;
background-color:rgba(0,0,0,0.5);
//padding:4rem 0 0 0 ;
bottom:65%;
left:-6%;
z-index:10;
border-radius:0.5rem;
transition:transform 1s;

}

.s:hover::before{
animation:second-1 2s linear infinite  ;
}


@keyframes second-1{

50%{
transform:translateY(25%) rotateZ(10deg);
background-color:rgba(249, 127, 37,0.4);
box-shadow:0.3rem 0.3rem 0.5rem rgba(249, 127, 37,0.4);
z-index:-1;

}
100%{
transform:translateY(0%) rotateZ(0deg);
z-index:-1;
}
}

.s:hover::after{
animation:second-2 2s linear infinite  ;
}

@keyframes second-2{

50%{
transform:translateY(-25%) rotateZ(10deg);
background-color:rgba(249, 127, 37,0.4);
box-shadow:0.3rem 0.3rem 0.5rem rgba(249, 127, 37,0.4);
}
100%{
transform:translateY(0%) rotateZ(0deg);
}
}
  
    .t{
width:30rem;
height:6rem;
display:flex;
background-color:rgba(250,250,250,0.1);
border-radius:1rem;
justify-content:center;
flex-direction:column;
margin:0 0 3rem 0 ;
backdrop-filter:blur(20px);
  box-shadow:0.4rem 0.4rem 1rem rgba(255,255,255,0.2);
  border-top:0.05rem solid rgba(255,255,255,0.6);
border-left:0.05rem solid rgba(255,255,255,0.6);
z-index:100;
}
.third{
  display:flex;
  align-self: center;
  }
  .r-3{
  display:flex;
  flex-direction:row;
  align-self: center;
  padding:0 0 1rem 0 ;

  }
 

  
.t::after{
position:absolute;
content:"";
width:4rem;
height:4rem;
background-color:rgba(0,0,0,0.5);
//padding:4rem 0 0 0 ;
top:65%;
right:-6%;
z-index:-1;
border-radius:0.5rem;
transition:transform 1s;
}

.t::before{
position:absolute;
content:"";
width:4rem;
height:4rem;
background-color:rgba(0,0,0,0.5);
//padding:4rem 0 0 0 ;
bottom:65%;
left:-6%;
z-index:10;
border-radius:0.5rem;
transition:transform 1s;

}

.t:hover::before{
animation:third-1 2s linear infinite  ;
}


@keyframes third-1{

50%{
transform:translateY(25%) rotateZ(10deg);
background-color:rgba(183, 249, 37,0.4);
box-shadow:0.3rem 0.3rem 0.5rem rgba(183, 249, 37,0.4);
z-index:-1;

}
100%{
transform:translateY(0%) rotateZ(0deg);
z-index:-1;
}
}

.t:hover::after{
animation:third-2 2s linear infinite  ;
}

@keyframes third-2{

50%{
transform:translateY(-25%) rotateZ(10deg);
background-color:rgba(183, 249, 37,0.4);
box-shadow:0.3rem 0.3rem 0.5rem rgba(183, 249, 37,0.4);
}
100%{
transform:translateY(0%) rotateZ(0deg);
}
}
  

</style>
</head>
<body>
<div class="glass">
<form action="question" method="get">

<div class="f">

<p class="first">choose a color:</p>
<div class="r-1">
<input type="radio" name="one"  value="red" id="one_one">red</input>
<input type="radio" name="one" value="black" id="one_two">black</input>
<input type="radio" name="one" value="green" id="one_three">green</input>
<input type="radio" name="one" value="blue" id="one_four">blue</input>
</div>
</div>

<div class="s">
<p class="second">choose a place:</p>
<div class="r-1">
<input type="radio"  name="two"  value="dessert" id="two_one">dessert</input>
<input type="radio" name="two" value="polar night" id="two_two">polar night</input>
<input type="radio" name="two" value="rain forest" id="two_three">rain forest</input>
<input type="radio"  name="two" value="sea" id="two_four">sea</input>
</div>
</div>

<div class="t">
<p class="third">choose a movie genre:</p>
<div class="r-1">
<input type="radio" name="three" value="action" id="three_one">action</input>
<input type="radio" name="three" value="horror" id="three_two">horror</input>
<input type="radio" name="three" value="drama" id="three_three">drama</input>
<input type="radio" name="three" value="fantasy" id="three_four">fantasy</input><br>
<br>
</div>
</div>
<input type="submit" id="submit" value="Submit"></input>
</form>
</div>
<script>
document.querySelectorAll(
'input[type=radio]').forEach((elem) => {
elem.addEventListener('click', allowUncheck);

elem.previous = elem.checked;
});

function allowUncheck(e) {
if (this.previous) {
this.checked = false;
}

document.querySelectorAll(
  `input[type=radio] `).forEach((elem) => {
elem.previous = elem.checked;
});
}

</script>
</body>
</html>