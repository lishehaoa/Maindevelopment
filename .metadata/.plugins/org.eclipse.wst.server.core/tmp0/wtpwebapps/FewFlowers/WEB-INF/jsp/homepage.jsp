﻿<!doctype html>
<html>
<link rel="shortcut icon" href="static/images/huashao.png">
<head>
<meta charset="utf-8">
<title>FewFlowers-花少主题</title>
<style>
@import url('https://fonts.googleapis.com/css?family=Open+Sans:700');
body {
	margin:0;
	height:100vh;
	width:100vw;
	background:#000000;
	overflow:hidden;
}
*{
	box-sizing:border-box;
}
#page{
	width:100%;
	height:100%;
	display:flex;
	justify-content:center;
	align-items:center;
}


#center {
	position:absolute;
	z-index:5;
   background-color: #ffff64;	
	transition:0.25s;
	animation:float 1s infinite;
}

#center .icon{
	padding:40px 0px;
	position:relative;
	height:100%;
	width:100%;
	display:flex;
	flex-direction:column;
	justify-content:space-around;
	align-items:center;
/* 	transform: skew(-50deg); */
}

.bar{
	height:15px;
	width:50%;
/* 	border-radius:25px; */
	background:#000000;
}

.btn{
	width: 200px;
   height: 200px;
}

nav{
	position:relative;
	transform: rotateX(60deg) rotateY(0deg) rotateZ(-45deg);
/* 	transform: rotate(-30deg) skew(30deg,0deg); */
	width:200px;
	height:200px;
}

.btn.item{
	position:absolute;
	top:0;
	z-index:1;
	transition: all 0.25s ease-out;
	left:0px;
	top:0px;
	opacity:1;
}

.btn.item:not(.opened){
	background:rgba(255, 255, 255,0.5);
}

#center:hover{
	cursor:pointer;
	background:#ff1464 !important;
}

#center:hover .bar{
	background:#ffffff;
}

.btn.item a:hover{
	cursor:pointer;
	background:#ff1464 !important;
	color:#ffffff !important;
}

.btn.item a{
	opacity:0;
}

.btn.item.opened a{
	opacity:1;
	background:#ffff64;
	color:#000000;
	padding:0 15px;
}

.btn.item.opened{
	font-family:'open sans';

	font-size:5rem;
	display:flex;
	justify-content:center;
	align-items:center;
}

#up,#bottom{
	top:20px;
	left:-20px;
}

#right,#left{
	top:40px;
	left:-40px;
}

#up.opened{
	top:-100%;
	left:0;
}

#right.opened{
	left:140%;
	top:0;
}

#bottom.opened{
	top:100%;
	left:0;
}

#left.opened{
	left:-140%;
	top:0;
}

#center.close .bar.top{
	position:absolute;
	top:40px;
	left:50px;
	transform-origin:center left;
	transform:rotateZ(45deg);
	width:70%;
}

#center.close .bar.bottom{
	position:absolute;
	bottom:40px;
	left:50px;
	transform-origin:center left;
	transform:rotateZ(-45deg);
	width:70%;
}

#center.close .bar.middle{
	width:0
}


@keyframes float {
  0%,100% {
    top: 0px;
	 left:0px;
  }

  50% {
    top: -5px;
	 left:5px;
  }
}
a{ 
	text-decoration:none
}
</style>

</head>
<body>

<div id="page">
	<nav>
		<div id="center" class="btn">
			<div class="icon">
				<div class="bar top"></div>
				<div class="bar middle"></div>
				<div class="bar bottom"></div>
			</div>
		</div>
		<div id="up" class="btn item">
			<a href="tologin">登&nbsp;&nbsp;&nbsp;录</a>
		</div>
		<div id="right" class="btn item">
			<a href="toregister">注&nbsp;&nbsp;&nbsp;册</a>
		</div>
		<div id="bottom" class="btn item">
			<a>修&nbsp;&nbsp;&nbsp;改</a>
		</div>
		<div id="left" class="btn item">
			<a href="tohuashao">花&nbsp;&nbsp;&nbsp;少</a>
		</div>
	</nav>
</div>

<script>
const navItems = document.querySelectorAll('nav .item');

document.querySelector('#center').addEventListener('click',function(){
	for(let i=0;i<navItems.length;i++){
		navItems[i].classList.toggle('opened')
	}
	document.querySelector('#center').classList.toggle('close')
})
</script>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#ffffff">
</div>
</body>
</html>