import geb.*

	





Browser.drive {
		
		to SEHomePage
		def newUserID = "userName987654321@mailinator.com"
		def retUserID = newUserRegister newUserID
		
		
		//to SEHomePage
		//RegisterEmailID("venkat271176@gmail.com")
		//enterEmail "venkat271176@gmail.com"
		
	}.quit()

