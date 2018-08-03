<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	

	$("div").click(function() {
	    alert( $(this).html() );
	});

	$(".btn").click(function() {
		console.dir(this.parentNode.parentNode.cells[0].innerText);

	});

});

</script>

<body>


<h1> hihi</h1>

<table>
	<colgroup>
		<col>
		<col>
		<col>
	</colgroup>
	 <thead>
	 	<tr>
	 		<th>column(1)</th>
	 		<th>column(2)</th>
	 		<th>column(3)</th>
	 		
	 	</tr>
	 </thead>
	 <tbody>
	 	<tr>
	 		<td>1111</td>
	 		<td><button class="btn">what</button></td>
	 		<td>3333</td>
	 	</tr>
	 	<tr>
	 		<td>4444</td>
	 		<td><button class="btn">what</button></td>
	 		<td>6666</td>
	 	</tr>
	 	<tr>
	 		<td>7777</td>
	 		<td><button class="btn">what</button></td>
	 		<td>9999</td>
	 	</tr>
	 </tbody>
</table>
<div>1</div>
<div>2</div>
<div>3</div>
<div>4</div>
<div>5</div>


</body>
</html>