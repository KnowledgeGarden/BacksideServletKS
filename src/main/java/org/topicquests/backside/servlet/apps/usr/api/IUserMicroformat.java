/**
 * 
 */
package org.topicquests.backside.servlet.apps.usr.api;

import org.topicquests.backside.servlet.api.ICredentialsMicroformat;

/**
 * @author park
 * <p>Microformat for passing user information</p>
 * <p>These apply <em>only</em> to the User App, which only deals with
 *  the user database, not the topic map</p>
 */
public interface IUserMicroformat extends ICredentialsMicroformat {
	/**
	 * JSON Attributes
	 */
	public static final String
		USER_ROLE 		= "uRole",
		USER_AVATAR		= "uAvatar",
		USER_GEOLOC		= "uGeoloc",
		USER_HOMEPAGE	= "uHomepage",
		USER_FULLNAME	= "uFullName",
		/** starts a list of USER_PROPERTY objects */
		USER_PROPERTIES	= "uProplist",
		USER_PROPERTY 	= "uProp",
		PROP_KEY		= "pKey",
		PROP_VAL		= "pVal",
		/** list of usernames, possibly empty */
		USER_LIST		= "uList";
	
	/**
	 * Verbs
	 */
	public static final String
		/**
		 *<p> NEW_USER would be used at the client side simply to paint forms;
		 * it is now sent into a GET.</p>
		 * <p>Sent in as a POST, its cargo would be the necessary data for that user,
		 * as captured in a NewUser form.</p>
		 */
		NEW_USER		= "NewUser", 	//POST
		/** subject to common modifiers */
		LIST_USERS		= "ListUsers", 	//GET
		GET_USER		= "GetUser";  //GET
}