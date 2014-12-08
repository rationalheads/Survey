
/*------------------------------------------------- QUESTION TYPE: SECOND PHASE ------------------------------------------------*/

var desc=0;
var sing=0;
var mult=0;
var matr=0;
var rank=0;
var rate=0;
var dnd=0;
var csum=0;

	function qtSingle(){
		
		    document.getElementById('mainDiv').innerHTML = "";
			var ni = document.getElementById('myDiv');
			ni.innerHTML = "";
  
	        var newdiv1 = document.createElement('tr');
	        newdiv1.setAttribute('class','question');
			
			newdiv1.innerHTML = '<td style="width: 100px"><label>Question&nbsp;Id</label></td><td></td><td></td>';
			ni.appendChild(newdiv1);

			var newdiv2 = document.createElement('tr');
			
			newdiv2.innerHTML = '<td><label>Question</label></td>'
			+ '<td colspan="6"><input type="text" maxlength="255" placeholder="enter the question"/></td>';
			ni.appendChild(newdiv2);
			
			k=1;
			option();	
	}
	

	function qtMultiple(){
		
		    document.getElementById('mainDiv').innerHTML = "";
			var ni = document.getElementById('myDiv');
			ni.innerHTML = "";
	        
	        var newdiv1 = document.createElement('tr');
	        newdiv1.setAttribute('class','question');
			
			newdiv1.innerHTML = '<td style="width: 100px"><label>Question&nbsp;Id</label></td><td></td><td></td>';
				
			ni.appendChild(newdiv1);

			var newdiv2 = document.createElement('tr');
			
			newdiv2.innerHTML = '<td><label>Question</label></td>'
			+ '<td colspan="6"><input type="text" maxlength="255"  placeholder="enter the question"/></td>';
			ni.appendChild(newdiv2);
			
			k=1;
			option();
		
	}

	function qtDescriptive(){
		
		    document.getElementById('mainDiv').innerHTML = "";
			var ni = document.getElementById('myDiv');
			ni.innerHTML = "";
	        
	        var newdiv1 = document.createElement('tr');
	        newdiv1.setAttribute('class','question');
			
			newdiv1.innerHTML = '<td style="width: 100px"><label>Question&nbsp;Id</label></td><td></td>';
				
			ni.appendChild(newdiv1);
			
			var newdiv2 = document.createElement('tr');
			
			newdiv2.innerHTML = '<td><label>Question</label></td>'
			+ '<td colspan="6"><input type="text" maxlength="255" placeholder="enter the question"/></td>';
			ni.appendChild(newdiv2);
		
	}
	
	function qtMatrix(){
		   document.getElementById('myDiv').innerHTML = "";
		   var nia = document.getElementById('mainDiv');
		   nia.innerHTML = "";
		   
		   var div = document.createElement('div');
		   div.innerHTML = 'Rows<input type="number" min="1" max="5" step="1" id="rows">'
			      +  'Columns<input type="number" min="1" max="5" id="columns">';
		   nia.appendChild(div);
	}
	
	function qtMatrix1(){
		   var radios = document.getElementsByName('choicetype');
		   var length = radios.length;
		   
		   for (var i = 0; i < length; i++) {
			    if (radios[i].checked) {
			    	var ravalue= parseInt(radios[i].value, 10);
			    	
			    	switch (ravalue) {
					case 1:
						optMat("radio");
						break;
					
					case 2:
						optMat("checkbox");
						break;
						
					/*case 3:
						optMat("text");
						break;*/
						
					default:
						alert("reselect");
						break;
					}
			    	break;
			    }
			}   
	}
	
	function optMat(variable) {
		
		var ni = document.getElementById('myDiv');
		ni.innerHTML = "";
		
		var newdiv1 = document.createElement('tr');
        newdiv1.setAttribute('class','question');
        
        newdiv1.innerHTML = '<td style="width: 100px"><label>Question&nbsp;Id</label></td><td></td><td></td>';	
		ni.appendChild(newdiv1);
		
        var newdiv2 = document.createElement('tr');
		newdiv2.innerHTML = '<td><label>Question</label></td>'
		     + '<td colspan="6"><input type="text" maxlength="255" placeholder="enter the question text"/></td>';
		ni.appendChild(newdiv2);
		
		var nRows=document.getElementById("rows");
	    var nColumns=document.getElementById("columns");
	    var tableStr = "";

	    for(i=0; i<=nRows.value; i++)
	    {
	    	var nrows = i.toString();
	    	var mrows = "nrows" + nrows;
	    	mrows = document.createElement('tr');
	    	mrows.setAttribute('id','thead');
	    	
	        if (i==0) {
	        	
	        	
	        	for (j=0; j<=nColumns.value; j++) 
	        	{
	        		if (j==0) {
	        			tableStr += '<th></th>';
					}
	        		else
		        	{
	        		    tableStr += '<th><input type="text" contenteditable="true" value="Class'+j+'"/></th>';
				    }
	        	}
	        	mrows.innerHTML = tableStr;
	        	ni.appendChild(mrows);
	        	tableStr = "";
			}
	        else {
	        	for(j=0; j<=nColumns.value; j++)
	        	{
	        		if (j==0) {
	        			tableStr += '<th><input type="text" contenteditable="true" value="Elem'+i+'"/></th>';
					}
	        		else {
	        			tableStr += '<td><input type="'+variable+'" value="" name="matradio'+i+'" /></td>';
					}
	        	}
	        	
	        	mrows.innerHTML = tableStr;
	        	ni.appendChild(mrows);
	        	tableStr = "";
			}
	        
	    }
		
	}

	
	function qtDandD(){
		
		    document.getElementById('mainDiv').innerHTML = "";
            var ni = document.getElementById('myDiv');
            ni.innerHTML = "";
	        
	        var newdiv1 = document.createElement('tr');
	        newdiv1.setAttribute('class','question');

			
			newdiv1.innerHTML = '<td style="width: 100px"><label>Question&nbsp;Id</label></td><td></td>';
			ni.appendChild(newdiv1);

			var newdiv2 = document.createElement('tr');
			
			newdiv2.innerHTML = '<td><label>Question</label></td>'
			+ '<td colspan="6"><input type="text" maxlength="255" placeholder="enter the question"/></td>';
			ni.appendChild(newdiv2);
			
			k=1;
			option();		
	}
	
	function qtCSum(){
		
		document.getElementById('mainDiv').innerHTML = "";
        var ni = document.getElementById('myDiv');
        ni.innerHTML = "";
        
        var newdiv1 = document.createElement('tr');
        newdiv1.setAttribute('class','question');

		
		newdiv1.innerHTML = '<td style="width: 100px"><label>Question&nbsp;Id</label></td><td></td>';
		ni.appendChild(newdiv1);

		var newdiv2 = document.createElement('tr');
		
		newdiv2.innerHTML = '<td><label>Text</label></td>'
		       + '<td colspan="6"><input type="text" maxlength="255" placeholder="enter the question text"/></td>';
		ni.appendChild(newdiv2);
		
		var fu1 = document.createElement('tr');
		fu1.innerHTML = '<td><label>Total Count</label></td><td><input type="number"  value="100" readonly/>';
		ni.appendChild(fu1);
		
		k=1;
		option();
	}
	
    function qtRating(){
		
		document.getElementById('mainDiv').innerHTML = "";
        var ni = document.getElementById('myDiv');
        ni.innerHTML = "";
        
        var newdiv1 = document.createElement('tr');
        newdiv1.setAttribute('class','question');

		
		newdiv1.innerHTML = '<td style="width: 100px"><label>Question&nbsp;Id</label></td><td></td>';
		ni.appendChild(newdiv1);

		var newdiv2 = document.createElement('tr');
		
		newdiv2.innerHTML = '<td><label>Text</label></td>'
		+ '<td colspan="6"><input type="text" maxlength="255" placeholder="enter the question text"/></td>';
		ni.appendChild(newdiv2);
		
		k=1;
		option();
	}
	
	function qtRanking(){
		
		    document.getElementById('mainDiv').innerHTML = "";
            var ni = document.getElementById('myDiv');
            ni.innerHTML = "";
	        
	        var newdiv1 = document.createElement('tr');
	        newdiv1.setAttribute('class','question');

			
			newdiv1.innerHTML = '<td style="width: 100px"><label>Question&nbsp;Id</label></td><td></td>';
			ni.appendChild(newdiv1);

			var newdiv2 = document.createElement('tr');
			
			newdiv2.innerHTML = '<td><label>Text</label></td>'
			+ '<td colspan="6"><input type="text" maxlength="255" placeholder="enter the question text"/></td>';
			ni.appendChild(newdiv2);
			
			k=1;	
			option();
	}

	
	/*------------------------------------------------- QUESTION TYPE: FIRST PHASE------------------------------------------------*/


	function qtSingle2()
	{
		while (sing==0)
		{
			qtSingle();
			sing++;
			desc=0;
			mult=0;
			matr=0;
			rank=0;
			rate=0;
			dnd=0;
			csum=0;
		}
	}
	
	function qtMultiple2() {
		while (mult==0) {
			qtMultiple();
			mult++;
			desc=0;
			sing=0;
			matr=0;
			rank=0;
			rate=0;
			dnd=0;
			csum=0;
		}	
	}
	

	function qtDescriptive2(){
		while (desc==0)
		{
			qtDescriptive();
			desc++;
			sing=0;
			mult=0;
			matr=0;
			rank=0;
			rate=0;
			dnd=0;
			csum=0;
		}
	}
	
    function qtMatrix2(){
		
		while (matr==0) {
			qtMatrix();
			matr++;
			desc=0;
			sing=0;
			mult=0;
			rank=0;
			rate=0;
			dnd=0;
			csum=0;
		}
    }

	function qtDandD2(){
		while (dnd==0) {
			qtDandD();
			dnd++;
			desc=0;
			sing=0;
			mult=0;
			matr=0;
			rank=0;
			rate=0;
			csum=0;
		}
	}

	function qtCSum2(){
		
		while (csum==0) {
			qtCSum();
			csum++;
			desc=0;
			sing=0;
			mult=0;
			matr=0;
			rank=0;
			rate=0;
			dnd=0;
		}
	}
	
	function qtRating2(){
		while (rate==0) {
			qtRating();
			rate++;
			desc=0;
			sing=0;
			mult=0;
			matr=0;
			rank=0;
			dnd=0;
			csum=0;
		}
	}

	function qtRanking2(){
		
		while (rank==0) {
			qtRanking();
			rank++;
			desc=0;
			sing=0;
			mult=0;
			matr=0;
			rate=0;
			dnd=0;
			csum=0;
		}
	}

	/*------------------------------------------------- OPTIONS TYPE------------------------------------------------*/
	
   function option(){
		
		var opradio = document.getElementsByName('optiontype');
		var length = opradio.length;
		
		for (var i = 0; i < length; i++) {
		    if (opradio[i].checked)
		    {
		    	var opt= parseInt(opradio[i].value, 10);
		    	if (opt==1){
			        addSingle();
		        }
		       else{
			        addImage();
		       }
		   }
	   }
	}
   
   function deleterow() {
		pi = document.getElementById('myDiv');
		length = pi.rows.length;
		for(var i=2; i<length; i++)
			{
			var row = document.getElementById('optionte');
			row.parentNode.removeChild(row);   
			}	
   }
	
   function chooseoptiontype() {
		
		var radios = document.getElementsByName('questiontype');
		var length = radios.length;
		
		for (var i = 0; i < length; i++) {
		    if (radios[i].checked) {
		    	var ravalue= parseInt(radios[i].value, 10);
		    	
		    	
		    	switch (ravalue) {
				case 1:
				case 2:
				case 5:
				case 7:
				case 8:
					k=1;
					deleterow();
					option();
					break;
				default:
					break;
				}
		    	break;
		    }
		}
	}
	
	var k=1;
    var i=0;

	function addImage() {

		var ni = document.getElementById('myDiv');
		
		if(k<6){
			if(k<4)
				{
				while (k<4) {
					callImage();
				}
				}
			else{
				callImage();
			}
		}
		
		function callImage() {
			var newdiv3 = document.createElement('tr');
			newdiv3.setAttribute('id', 'optionte');
			
			newdiv3.innerHTML = '<td style="text-align: right;"><label>'+k+'.</label></td>'
				+ '<td><input type="file" name="name" id="name" onchange="readURL(this)"></td>'
				+ '<td><img src="" id="image" height="100" width="200" alt="Image Preview"></td>'
				+ '<td><button type="button" name="name" class="buttons" value="Remove" onclick="removeEl();">'
				+ '<img id="btnimg" src="images/remove.png" ></button>'
				+ '<button type="button" name="name" class="buttons" value="AddOption" onclick="addImage();">'
				+ '<img id="btnimg" src="images/add.png" ></button></td>';

			ni.appendChild(newdiv3);
			
			k++;
		}
	}
	
	function addSingle() {	

		var ni = document.getElementById('myDiv');
		
		if(k<6){
			if(k<4)
				{
				while (k<4) {
					callText();
				}
				}
			else{
				callText();
			}
		}
		
		function callText() {
			var newdiv3 = document.createElement('tr');
			newdiv3.setAttribute('id', 'optionte');
			
			newdiv3.innerHTML = '<td style="text-align: right;"><label>'+k+'.</label></td>'
		    + '<td><label contenteditable="true">Option'+k+'</label></td>'
		    + '<td><button type="button" name="name" class="buttons" value="Remove" onclick="removeEl();">'
			+ '<img id="btnimg" src="images/remove.png" ></button>'
			+ '<button type="button" name="name" class="buttons" value="Add" onclick="addSingle()">'
			+ '<img id="btnimg" src="images/add.png" ></button></td>';
			
			ni.appendChild(newdiv3);
		  
		    k++;
		}	
	}
	
	/*------------------------------------------------- LIST MANAGEMENT ------------------------------------------------*/
	
	function openList(kas) {
		var spr = "ollist" + kas;
		var list = document.getElementById(spr);

		if (list.style.display == "none") {
			list.style.display = "block";
		} else {
			list.style.display = "none";
		}
		
		var i=kas;
		var j=kas;
		while((i!=0) && (j!=7)){
			i--;
			j++;
			
			var spr1 = "ollist" + i;
			var list1 = document.getElementById(spr1);
			
			var spr2 = "ollist" + j;
			var list2 = document.getElementById(spr2);
			
			if ((list1.style.display == "block") || (list2.style.display == "block") ) {
				list1.style.display = "none";
				list2.style.display = "none";
			}
		}
	}
	
	function openM() {
		var list = document.getElementById('ollist8');
		if(document.getElementById('matrix').checked)
		{
			list.style.display = "block";
		} else{
			list.style.display = "none";
		}
	}
	
	function readURL(input) {
	      if (input.files && input.files[0]) {
	       var reader = new FileReader();
	       reader.onload = function(e) {
	           $('#image').attr('src', e.target.result);
	       }
	       reader.readAsDataURL(input.files[0]);
	       }
	     }