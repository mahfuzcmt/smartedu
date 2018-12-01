package smart.edu

class LoginController {

   def index = { }
	
	def login ={
		if (params.username && params.password){
			session.user = params.username
			redirect(action: 'index')
		}		
	}
	
	def logout ={
		session.user = null
		redirect(action: 'index')
	}
}
