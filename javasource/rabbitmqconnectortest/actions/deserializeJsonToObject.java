// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package rabbitmqconnectortest.actions;

import restservices.util.JsonDeserializer;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.thirdparty.org.json.JSONObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class deserializeJsonToObject extends CustomJavaAction<Boolean>
{
	private String json;
	private IMendixObject targetObject;

	public deserializeJsonToObject(IContext context, String json, IMendixObject targetObject)
	{
		super(context);
		this.json = json;
		this.targetObject = targetObject;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		JsonDeserializer.readJsonDataIntoMendixObject(getContext(), new JSONObject(json), targetObject, false);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "deserializeJsonToObject";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
