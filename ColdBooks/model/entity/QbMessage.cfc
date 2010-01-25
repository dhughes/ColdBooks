/**
* I model a message sent to QB
*/
component extends="Entity" output="false" accessors="true" persistent="true" displayname="Message" {
	property name="id" type="numeric";
	property name="connectionId" type="numeric";
	property name="messageId" type="string";
	property name="request" type="string";
	property name="response" type="string";
	property name="callbackType" type="string"; 
	property name="callbackCFC" type="string";
	property name="callbackFunction" type="string";
	property name="returnFormat" type="string";
	property name="error" type="string";
	property name="createdDate" type="any";
	property name="modifiedDate" type="any";
	
	public function getQbMessageId(){
		return "{" & left(getmessageId(), 23) & "-" & right(getmessageId(), 12) & "}";
	}
	
	public function getStatus(){
		if(NOT Len(getResponse()) && NOT Len(getError())){
			return "pending";
		} else if(NOT Len(getResponse()) && Len(getError())){
			return "quickbooks error";
		} else if(Len(getResponse()) && Len(getError())){
			return "coldfusion error";
		} else if(Len(getResponse()) && NOT Len(getError())){
			return "complete";
		}
	}
}