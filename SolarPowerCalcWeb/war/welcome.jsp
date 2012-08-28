<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5.0 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Solar Calculator Tool - Welcome</title>
<LINK href="<%=request.getContextPath()%>/css/greenhat_style.css" rel="stylesheet" type="text/css">
</head>
<body>
    <!-- =============== HEADER =============== -->
    <div id="header" align = "center">
            <img src = "logo.jpg" alt = "Header Logo" class = "logoSize" />
    </div>  <!-- end div header -->

    <!-- =============== BREADCRUMB =============== -->
    <div id="breadcrumb">
      You are here: Home
    </div>

    <!-- =============== MAIN =============== -->
    <div id="main">
       <div id="menu"> <!-- start main menu div -->
        
	        <h2>Navigation </h2>

	        <h3>.........</h3>
            <ul>
	            <li> <a href = ""> ....... </a></li>
	            <li> <a href = ""> ...... </a></li>
            </ul>
	        <h3>Useful links </h3>
            <ul>
	            <li> <a href = ""> ..... </a></li>
	            <li> <a href = ""> .......</a></li>
            </ul>
	        <h3>About us</h3>
            <ul>
	            <li> <a href = ""> Contact us</a></li>
	            <li> <a href = ""> About us </a></li>
            </ul>
       </div>  <!-- end menu div -->

       <div id="content"> <!-- start content div -->
       
	    	<h1 align = "center"> Solar Calculator Tool </h1>
			<table style="width: 900px;"align="left"> 
				<tr>
				<td> 
					<p>Given the details about the solar equipment, location and roof orientation, 
					this solar calculator tool can calculate how much solar power you can generate in a day and year. </p> 
					
					<p> Given the details about the cost, tariffs, ....
					this tool can also calculate the expected annual savings and return on investment. </p>
					
					<p>To use the tool, you need to <a href = "/authentication"> sign in </a>.</p>
				</td>
				</tr>
				<tr>
				<td> 
					<p></p>
					<p></p>
					<p></p>
					<p></p>
					<p></p>
					<p></p>
					<p></p>
					<p></p>
					<p></p>
					
				</td>
				</tr>
			</table>
		</div>
    </div>  <!-- end main div -->

    <!-- =============== FOOTER =============== -->
    <div id="footer">
    	
    	<table>
    	<tr>
			<td> 
				<div>
	 				<p>Disclaimer: </p>
					<p>This Solar System Calculator is provided to help you understand some basic electrical terms & calculations. 
					It can give you an estimate of your total power usage (in either amp hours or watt hours).However we still urge you to make use of our services to give you a more detailed and accurate assessment of your power usage and what equipment you will require to meet your electrical loads. 
					This calculator is not meant to be used as a total 'power system designer'.The actual power usage of many appliances can vary considerably from what the compliance label suggests- eg a washing machine rated at 1800 watts may only use 100 watt hours of power per load 
					if the water heating element is not used! Microwave ovens, fridges, computers & home entertainment devices are other examples of equipment where experience is needed to accurately assess the expected watt hours of actual power used.</p>
					<p> Source: http://www.rpc.com.au/information/faq/system-design/solar-power-calculator.html</p>
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<div id="copyright"> <!-- start copyright div -->
         			<span class = "copyYourName"><a href="mailto:martin.daniel@student.qut.edu.au">&copy Greenhat Solar Systems</a></span><br />
         			All images &copy Greenhat Solar Systems
      			</div> <!-- end copyright div -->

      			<div id="lastupdate"> <!-- start lastupdate div -->
         			Last updated: 27 August 2012
      			</div> <!-- end lastupdate div -->
			</td>
		</tr>
    	</table>
    </div>  <!-- end footer div -->

  </body>
  </html>