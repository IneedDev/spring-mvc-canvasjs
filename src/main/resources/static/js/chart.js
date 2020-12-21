    console.log("test")
    var dps = [[]];
    var chart = new CanvasJS.Chart("chartContainer", {
    	theme: "light2", // "light1", "dark1", "dark2"
    	animationEnabled: true,
    	title: {
    		text: "Average Sea Temperature - Amsterdam"
    	},
    	axisX: {
    		valueFormatString: "MMM"
    	},
    	axisY: {
    		title: "Temperature (in °C)",
    		includeZero: true,
    		suffix: " °C"
    	},
    	data: [{
    		type: "line",
    		xValueType: "dateTime",
    		xValueFormatString: "MMM",
    		yValueFormatString: "#,##0 °C",
    		dataPoints: dps[0]
    	}]
    });

    var xValue;
    var yValue;

//    <c:forEach items="${dataPointsList}" var="dataPoints" varStatus="loop">
//    	<c:forEach items="${dataPoints}" var="dataPoint">
//    		xValue = parseInt("${dataPoint.x}");
//    		yValue = parseFloat("${dataPoint.y}");
//    		dps[parseInt("${loop.index}")].push({
//    			x : xValue,
//    			y : yValue
//    		});
//    	</c:forEach>
//    </c:forEach>

    chart.render();
