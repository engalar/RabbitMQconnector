// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.ORM;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Identical to acquirelock, but on failure, waits until the lock can be obtained.
 * Returns true if the lock has been granted, or false if the timeout (in seconds) has expired.
 */
public class waitForLock extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject item;
	private java.lang.Long timeOutSeconds;

	public waitForLock(IContext context, IMendixObject item, java.lang.Long timeOutSeconds)
	{
		super(context);
		this.item = item;
		this.timeOutSeconds = timeOutSeconds;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return ORM.waitForLock(this.getContext(), item, timeOutSeconds);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "waitForLock";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
