// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package rabbitmqconnector.actions;

import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import rabbitmqconnector.helper.RabbitMQConnectorHelper;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class RemoveQueue extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __configuration;
	private rabbitmqconnector.proxies.RMQConfiguration configuration;
	private java.lang.Boolean forceDelete;

	public RemoveQueue(IContext context, IMendixObject configuration, java.lang.Boolean forceDelete)
	{
		super(context);
		this.__configuration = configuration;
		this.forceDelete = forceDelete;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.configuration = __configuration == null ? null : rabbitmqconnector.proxies.RMQConfiguration.initialize(getContext(), __configuration);

		// BEGIN USER CODE
		if (configuration == null) throw new IllegalArgumentException("Input object is empty");
		
		Connection connection = null;
		Channel channel = null;

		try {
			ConnectionFactory factory = RabbitMQConnectorHelper.createConnectionFactory(configuration);
	        connection = factory.newConnection();
			channel = connection.createChannel();
			String exchangeName = configuration.getExchangeName();
			String queueName = exchangeName + "_queue";
			channel.queueDelete(queueName, forceDelete, forceDelete);
		} catch (Exception e) {
			throw new MendixRuntimeException("Failed to delete queue", e);
		} finally {
	        if (channel != null) channel.close();
	        if (connection != null) connection.close();
		}
        return true;

		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "RemoveQueue";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
