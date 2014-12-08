<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Login Form</title>
</head>
	<h1>Registration</h1>

	<form action="./SurveyCustInfoController?action=reg" method="post">
		<hr>
		<div>
			<input type="radio" value="i" name="acc_type" /><label>Individual</label>
			 <input	type="radio" value="c" name="acc_type" /><label>Corporate</label>
		</div>
		<hr>
		<div >
			<h2>Account Info</h2>
			<table>
			<tbody>
			<tr>
			<td><label >Email </label></td>
			<td> <input type="text" name="email" required /></td>
			</tr>
			<tr>
			<td><label>Password </label></td>
			<td><input type="password" name="password" required /></td>
			</tr>
			<tr>
			<!-- <td><label>Confirm Password </label></td>
			 <td><input type="password" name="c_password" required /></td> -->
			 </tbody></table>
		</div>
		<hr>
		<div>
			<h2>Contact Info</h2>
			<table><tbody>
			<tr>
			<td ><input type="radio" value="m" name="gender" /><label>Male</label></td>
			<td><input type="radio" value="f" name="gender" /><label>Female</label></td>
			</tr>
			
			<tr>
			<td><label >First Name </label></td>
			<td><input type="text" name="f_name" required /></td>
			</tr>
			<tr>
			<td><label>Last Name </label></td>
			<td><input type="text" name="l_name" required /></td>
			</tr>
			<tr>
			<td><label>Phone No. </label></td>
			<td><input type="number" name="msisdn" size="10" min="10" maxlength="10" /></td>
			</tr>
			<tr>
			<td> <label>Marital Status </label></td>
			<td><select size="1" name="marital_status">
			<option selected value="">Select one</option>
			<option value="m">Married</option>
  			<option value="u">Unmarried</option>
  			</select>
			</td>
			</tr>
			<tr>
			<td> <label>Company Name </label></td>
			<td><input type="text" name="company_name" /></td>
			</tr>
			<tr>
			<td> <label>Designation </label></td>
			<td><input type="text" name="designation" /></td>
			</tr>
			<tr>
			<td><label>Business Type </label></td>
			<td><input type="text" name="business_type" /></td>
			</tr>			
			</tbody></table>
				 
			 
			 
		</div>
		<hr>
		<div>
		<h2>Address Info</h2>
		<table><tbody>
		<tr>
		<td><label>Address 1 </label></td>
		<td><input type="text" name="address_1" required /></td>
		</tr>
		<tr>
		<td><label>Address 2 </label></td>
		<td><input type="text" name="address_2" /></td>
		</tr>
		<tr>
		<td><label>Locality </label></td>
		<td><input type="text" name="locality" required /></td>
		</tr>
		<tr>
		<td><label>City </label></td>
		<td><input type="text" name="city" required /></td>
		</tr>
		<tr>
		<td><label>Country </label></td>
		<td><input type="text" name="country" required /></td>
		</tr>
		<tr>
		<td><label>PIN/ZIP </label></td>
		<td><input type="text" name="pin_code"	size="10"  maxlength="10" required /></td>
		</tr>
		</tbody></table>
		   		 
		</div>
		<p>
			<input type="checkbox">I agree all the <a href="#">terms and
				condition</a>.
		</p><!-- <input type="hidden" name="finish" value="finish"/> -->
		<input type="submit" value="Register">
	</form>

<div>
		<div>
			<div>
				<!-- <a href="#" ="facebook"></a><a href="#" ="googleplus"></a><a href="#" ="twitter"></a><a href="#" ="tumbler"></a> -->
			</div>
			<p>
				© 2014 RationalHeads. All Rights Reserved.
			</p>
		</div>
	</div>
</body>
</html>
