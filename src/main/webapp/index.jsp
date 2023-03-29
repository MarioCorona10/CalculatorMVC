<html>
<body>

	<div style = "display: block; margin: auto; width: 50%; border-style: dotted;">
		<h1 style = "color:blue; margin-bottom: 10px; diplay: block; text-align: center;">Spring MVC Calculator</h1>
	
		<form>
			<div style = "margin-left: auto; margin-right: auto; width: 70%;">
				<h3 style = "display: inline-block; margin-left: 110px; margin-right: 10px;">First number:</h3>
					<input type = "text" name = "t1" style = "display:inline-block"><br>
			</div>
			<div style = "margin-left: auto; margin-right: auto; width: 70%;">
				<h3 style = "display: inline-block; margin-left: 90px; margin-right: 10px;">Second number:</h3>
					<input type = "text" name = "t2" style = "display:inline-block"><br>
			</div>
			<div style = "margin: auto; width: 50%;">
				<div style = "display: block; margin: auto; width: 50%;">
					<input type = "submit" value = "+" formaction = "add" style = "display: inline-block; margin-left: 50px; margin-top: 20px; margin-right: 20px; width: 50px; height: 50px">
						<input type = "submit" value = "-" formaction = "substract" style = "display: inline-block; margin-top: 20px; width: 50px; height: 50px">
				</div>
				<div style = "display: block; margin: auto; width: 50%;">
					<input type = "submit" value = "x" formaction = "multiply" style = "display: inline-block; margin-left: 50px; margin-top: 20px; margin-right: 20px; width: 50px; height: 50px">
					<input type = "submit" value = "/" formaction = "divide" style = "display: inline-block; margin-top: 20px; width: 50px; height: 50px">
				</div>
			</div>
		</form>
	
	</div>


</body>
</html>
