<!DOCTYPE html>

<!-- Declare the languaje of this Web page until the end of this <html> tag -->
<html lang="en">
	<!-- Define the title of this HTML document -->
	<title>Hello world</title>
	<!--Bootstrap is a HTML-CCS-JS framework for developing responsive (Remember to keep it updated) -->
	<link rel="stylesheet" type="text/css"
		href="webjars/bootstrap/3.3.5/css/bootstrap.min.css" />
	<body>

		<!--JQuery is a JavaScript library which makes easier to manipulate events, Ajax.. (Remember to keep it updated) -->
		<script type="text/javascript" src="webjars/jquery/2.1.4/jquery.min.js" ></script>

		<!-- Shows the time and a message (From HelloController) -->
		<kbd>${time}<span class="glyphicon glyphicon-console" ></span>${message}</kbd>
	</body>

</html>