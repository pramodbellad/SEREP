import geb.*
import geb.Page

class SEHomePage extends Page {
	
	static url = "https://staging.secretescapes.com"
	static at = {title == "Join now for Free | Save up to 70% on luxury travel | Secret Escapes"}
	   
	static content = {
		inputField {$("input[id=email]")}
		clickJoinNowButton {$("input[id=registrationButton]")}
		newPwd {$("input[id=newPassword]")}
		confrmPwd {$("input[id=confirmPassword]")}
			
			
		//NewPassword {$("input[id=newPassword]" && "input[placeholder=macha821]")}
		//ConfirnPassword {$("input[id=confirmPassword]" && "input[placeholder=macha821]" )}
		ChangePasswordButton {$("button[id=changePasswordButton]")}
		
		
	 		
		createTempPwd {$("input[id=temporaryPassword]")}
		theDiv { $('div',id:'passwordRequest')}
		theSpan { $('span',id:'temporaryPassword')}
		tempPwdWindowClose { $('a',id:'fancybox-close')}
		checkLoggedUser {$('div',id:'userInfo')}
		println "instantiating all the variables"
		
	}
	
	
	String newUserRegister(String myName) {
		//inputField.value userName
		println "inside newUserRegister function...."
		inputField.value myName 
		clickJoinNowButton.click()
		println theDiv.text()
		println theSpan.text()
		println checkLoggedUser.text()
		
		newPwd.value "machi1"
		confrmPwd.value "machi1"
		ChangePasswordButton.click()
		//tempPwdWindowClose.click()
		def tempLoggedUser = checkLoggedUser.text()
		println tempLoggedUser
		return tempLoggedUser
		
		
	}
	
	
}
		
	
