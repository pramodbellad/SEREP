import javax.mail.*;
import javax.mail.internet.*;
 

// setup connection
Properties props = new Properties();
def host = "192.168.4.101";
def username = "secretescapes2014@yahoo.com";
def password = "Venkat1234";
def provider = "pop3";
 
// Connect to the POP3 server

println "before connecting.."
Session session = Session.getDefaultInstance props, null
println session
Store store = session.getStore provider
store.connect host, username, password
println "after connecting.."
// Open the folder
Folder inbox = store.getFolder 'INBOX'
if (!inbox) {
	println 'No INBOX'
	System.exit 1
}
 
inbox.open(Folder.READ_ONLY)
 
// Get the messages from the server
Message[] messages = inbox.getMessages()
messages.eachWithIndex { m, i ->
	println "------------ Message ${i+1} ------------"
	m.writeTo(System.out)
}
// Close the connection
// but don't remove the messages from the server
inbox.close false
store.close()
