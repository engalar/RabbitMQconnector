// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.publish.RestServiceRequest;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class setResponseHeader extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String headerName;
	private java.lang.String value;

	public setResponseHeader(IContext context, java.lang.String headerName, java.lang.String value)
	{
		super(context);
		this.headerName = headerName;
		this.value = value;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		RestServiceRequest.setResponseHeader(getContext(), headerName, value);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "setResponseHeader";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
