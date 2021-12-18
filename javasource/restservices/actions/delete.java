// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.consume.RestConsumer;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class delete extends CustomJavaAction<IMendixObject>
{
	private java.lang.String resourceUrl;

	public delete(IContext context, java.lang.String resourceUrl)
	{
		super(context);
		this.resourceUrl = resourceUrl;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		return RestConsumer.deleteObject(getContext(), resourceUrl, null).getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "delete";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
