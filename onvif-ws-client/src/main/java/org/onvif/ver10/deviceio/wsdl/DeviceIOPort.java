package org.onvif.ver10.deviceio.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.1.0
 * Generated source version: 4.1.0
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", name = "DeviceIOPort")
@XmlSeeAlso({ObjectFactory.class, org.onvif.ver10.device.wsdl.ObjectFactory.class, org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class, org.w3._2004._08.xop.include.ObjectFactory.class, org.onvif.ver10.schema.ObjectFactory.class, org.oasis_open.docs.wsn.b_2.ObjectFactory.class, org.oasis_open.docs.wsn.t_1.ObjectFactory.class, org.w3._2003._05.soap_envelope.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface DeviceIOPort {

    /**
     * This operation lists what configuration is available for digital inputs.
     *       
     */
    @WebMethod(operationName = "GetDigitalInputConfigurationOptions", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetDigitalInputConfigurationOptions")
    @RequestWrapper(localName = "GetDigitalInputConfigurationOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetDigitalInputConfigurationOptions")
    @ResponseWrapper(localName = "GetDigitalInputConfigurationOptionsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetDigitalInputConfigurationOptionsResponse")
    @WebResult(name = "DigitalInputOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public org.onvif.ver10.deviceio.wsdl.DigitalInputConfigurationInputOptions getDigitalInputConfigurationOptions(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        java.lang.String token
    );

    /**
     * This operation gets a list of all available digital inputs.
     *       
     */
    @WebMethod(operationName = "GetDigitalInputs", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetDigitalInputs")
    @RequestWrapper(localName = "GetDigitalInputs", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetDigitalInputs")
    @ResponseWrapper(localName = "GetDigitalInputsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetDigitalInputsResponse")
    @WebResult(name = "DigitalInputs", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public java.util.List<org.onvif.ver10.schema.DigitalInput> getDigitalInputs()
;

    @WebMethod(operationName = "GetSerialPortConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetSerialPortConfigurations")
    @RequestWrapper(localName = "GetSerialPortConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetSerialPortConfiguration")
    @ResponseWrapper(localName = "GetSerialPortConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetSerialPortConfigurationResponse")
    @WebResult(name = "SerialPortConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public org.onvif.ver10.deviceio.wsdl.SerialPortConfiguration getSerialPortConfiguration(

        @WebParam(name = "SerialPortToken", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        java.lang.String serialPortToken
    );

    /**
     * Request the VideoSourceConfigurationOptions of a VideoSource. A device
     *         with one or more video sources shall support this command.
     *       
     */
    @WebMethod(operationName = "GetVideoSourceConfigurationOptions", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetVideoSourceConfigurationOptions")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetVideoSourceConfigurationOptionsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public GetVideoSourceConfigurationOptionsResponse getVideoSourceConfigurationOptions(

        @WebParam(partName = "parameters", name = "GetVideoSourceConfigurationOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        GetVideoSourceConfigurationOptions parameters
    );

    /**
     * Modify a digital input configuration.
     */
    @WebMethod(operationName = "SetDigitalInputConfigurations", action = "http://www.onvif.org/ver10/deviceio/wsdl/SetDigitalInputConfigurations")
    @RequestWrapper(localName = "SetDigitalInputConfigurations", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.SetDigitalInputConfigurations")
    @ResponseWrapper(localName = "SetDigitalInputConfigurationsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.SetDigitalInputConfigurationsResponse")
    public void setDigitalInputConfigurations(

        @WebParam(name = "DigitalInputs", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        java.util.List<org.onvif.ver10.schema.DigitalInput> digitalInputs
    );

    @WebMethod(operationName = "SendReceiveSerialCommand", action = "http://www.onvif.org/ver10/deviceio/wsdl/SendReceiveSerialCommand")
    @RequestWrapper(localName = "SendReceiveSerialCommand", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.SendReceiveSerialCommand")
    @ResponseWrapper(localName = "SendReceiveSerialCommandResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.SendReceiveSerialCommandResponse")
    public void sendReceiveSerialCommand(

        @WebParam(mode = WebParam.Mode.INOUT, name = "SerialData", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        jakarta.xml.ws.Holder<SerialData> serialData,
        @WebParam(name = "TimeOut", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        javax.xml.datatype.Duration timeOut,
        @WebParam(name = "DataLength", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        java.math.BigInteger dataLength,
        @WebParam(name = "Delimiter", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        java.lang.String delimiter
    );

    /**
     * Get the configuration of a Video Output. A device that has one or more
     *         Video Outputs shall support the retrieval of the VideoOutputConfiguration through this
     *         command.
     *       
     */
    @WebMethod(operationName = "GetVideoOutputConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetVideoOutputConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetVideoOutputConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public GetVideoOutputConfigurationResponse getVideoOutputConfiguration(

        @WebParam(partName = "parameters", name = "GetVideoOutputConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        GetVideoOutputConfiguration parameters
    );

    /**
     * Request the available settings and ranges for a physical Audio output. A
     *         device that has one or more AudioOutputs shall support this command.
     *       
     */
    @WebMethod(operationName = "GetAudioOutputConfigurationOptions", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetAudioOutputConfigurationOptions")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetAudioOutputConfigurationOptionsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public GetAudioOutputConfigurationOptionsResponse getAudioOutputConfigurationOptions(

        @WebParam(partName = "parameters", name = "GetAudioOutputConfigurationOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        GetAudioOutputConfigurationOptions parameters
    );

    /**
     * This operation sets the settings of a relay output.
     *         The relay can work in two relay modes:
     *         
     *         The physical idle state of a relay output can be configured by setting the IdleState to
     *         ‘open’ or
     *         ‘closed’ (inversion of the relay behaviour).
     *         
     *         Idle State ‘open’ means that the relay is open when the relay state is set to ‘inactive’
     *         through
     *         the trigger command (see Section 8.5.3) and closed when the state is set to ‘active’ through
     *         the same command.
     *         
     *         Idle State ‘closed’ means, that the relay is closed when the relay state is set to
     *         ‘inactive’
     *         through the trigger command (see Section 8.5.3) and open when the state is set to ‘active’
     *         through the same command.
     *       
     */
    @WebMethod(operationName = "SetRelayOutputSettings", action = "http://www.onvif.org/ver10/deviceio/wsdl/SetRelayOutputSettings")
    @RequestWrapper(localName = "SetRelayOutputSettings", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.SetRelayOutputSettings")
    @ResponseWrapper(localName = "SetRelayOutputSettingsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.SetRelayOutputSettingsResponse")
    public void setRelayOutputSettings(

        @WebParam(name = "RelayOutput", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        org.onvif.ver10.schema.RelayOutput relayOutput
    );

    /**
     * Request the available settings and ranges for one or all relay outputs. A
     *         device that has one or more RelayOutputs should support this command.
     *         
     *         Two examples that illustrate usage:
     *         
     *       
     */
    @WebMethod(operationName = "GetRelayOutputOptions", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetRelayOutputOptions")
    @RequestWrapper(localName = "GetRelayOutputOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetRelayOutputOptions")
    @ResponseWrapper(localName = "GetRelayOutputOptionsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetRelayOutputOptionsResponse")
    @WebResult(name = "RelayOutputOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public java.util.List<org.onvif.ver10.deviceio.wsdl.RelayOutputOptions> getRelayOutputOptions(

        @WebParam(name = "RelayOutputToken", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        java.lang.String relayOutputToken
    );

    /**
     * Modify a video input configuration. A device that has one or more video
     *         sources shall support the setting of the VideoSourceConfiguration through this command.
     *       
     */
    @WebMethod(operationName = "SetVideoSourceConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/SetVideoSourceConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "SetVideoSourceConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public SetVideoSourceConfigurationResponse setVideoSourceConfiguration(

        @WebParam(partName = "parameters", name = "SetVideoSourceConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        SetVideoSourceConfiguration parameters
    );

    /**
     * Get the video source configurations of a VideoSource. A device with one or
     *         more video sources shall support the GetVideoSourceConfigurations command..
     *       
     */
    @WebMethod(operationName = "GetVideoSourceConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetVideoSourceConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetVideoSourceConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public GetVideoSourceConfigurationResponse getVideoSourceConfiguration(

        @WebParam(partName = "parameters", name = "GetVideoSourceConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        GetVideoSourceConfiguration parameters
    );

    /**
     * Returns the capabilities of the device IO service. The result is returned
     *         in a typed answer.
     *       
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public org.onvif.ver10.deviceio.wsdl.Capabilities getServiceCapabilities()
;

    /**
     * Request the AudioSourceConfigurationOptions of an AudioSource. A device
     *         with one ore more AudioSources shall support this command.
     *       
     */
    @WebMethod(operationName = "GetAudioSourceConfigurationOptions", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetAudioSourceConfigurationOptions")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetAudioSourceConfigurationOptionsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public GetAudioSourceConfigurationOptionsResponse getAudioSourceConfigurationOptions(

        @WebParam(partName = "parameters", name = "GetAudioSourceConfigurationOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        GetAudioSourceConfigurationOptions parameters
    );

    /**
     * Modify a video output configuration. A device that has one or more video
     *         outputs shall support the setting of its video output configuration through this command.
     *       
     */
    @WebMethod(operationName = "SetVideoOutputConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/SetVideoOutputConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "SetVideoOutputConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public SetVideoOutputConfigurationResponse setVideoOutputConfiguration(

        @WebParam(partName = "parameters", name = "SetVideoOutputConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        SetVideoOutputConfiguration parameters
    );

    /**
     * List all available video outputs of a device. A device that has one or
     *         more physical video outputs shall support listing of available video outputs through the
     *         GetVideoOutputs command.
     *       
     */
    @WebMethod(operationName = "GetVideoOutputs", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetVideoOutputs")
    @RequestWrapper(localName = "GetVideoOutputs", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetVideoOutputs")
    @ResponseWrapper(localName = "GetVideoOutputsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetVideoOutputsResponse")
    @WebResult(name = "VideoOutputs", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public java.util.List<org.onvif.ver10.schema.VideoOutput> getVideoOutputs()
;

    @WebMethod(operationName = "GetSerialPortConfigurationOptions", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetSerialPortConfigurationOptions")
    @RequestWrapper(localName = "GetSerialPortConfigurationOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetSerialPortConfigurationOptions")
    @ResponseWrapper(localName = "GetSerialPortConfigurationOptionsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetSerialPortConfigurationOptionsResponse")
    @WebResult(name = "SerialPortOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public org.onvif.ver10.deviceio.wsdl.SerialPortConfigurationOptions getSerialPortConfigurationOptions(

        @WebParam(name = "SerialPortToken", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        java.lang.String serialPortToken
    );

    /**
     * List all available audio outputs of a device. A device that has one ore
     *         more physical audio outputs shall support listing of available audio outputs through the
     *         GetAudioOutputs command.
     *       
     */
    @WebMethod(operationName = "GetAudioOutputs", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetAudioOutputs")
    @RequestWrapper(localName = "GetAudioOutputs", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.Get")
    @ResponseWrapper(localName = "GetAudioOutputsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetResponse")
    @WebResult(name = "Token", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public java.util.List<java.lang.String> getAudioOutputs()
;

    @WebMethod(operationName = "SetSerialPortConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/SetSerialPortConfiguration")
    @RequestWrapper(localName = "SetSerialPortConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.SetSerialPortConfiguration")
    @ResponseWrapper(localName = "SetSerialPortConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.SetSerialPortConfigurationResponse")
    public void setSerialPortConfiguration(

        @WebParam(name = "SerialPortConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        org.onvif.ver10.deviceio.wsdl.SerialPortConfiguration serialPortConfiguration,
        @WebParam(name = "ForcePersistance", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        boolean forcePersistance
    );

    /**
     * Modify the relay state.
     */
    @WebMethod(operationName = "SetRelayOutputState", action = "http://www.onvif.org/ver10/deviceio/wsdl/SetRelayOutputState")
    @RequestWrapper(localName = "SetRelayOutputState", targetNamespace = "http://www.onvif.org/ver10/device/wsdl", className = "org.onvif.ver10.device.wsdl.SetRelayOutputState")
    @ResponseWrapper(localName = "SetRelayOutputStateResponse", targetNamespace = "http://www.onvif.org/ver10/device/wsdl", className = "org.onvif.ver10.device.wsdl.SetRelayOutputStateResponse")
    public void setRelayOutputState(

        @WebParam(name = "RelayOutputToken", targetNamespace = "http://www.onvif.org/ver10/device/wsdl")
        java.lang.String relayOutputToken,
        @WebParam(name = "LogicalState", targetNamespace = "http://www.onvif.org/ver10/device/wsdl")
        org.onvif.ver10.schema.RelayLogicalState logicalState
    );

    /**
     * Modify an audio source configuration. A device that has a one or more
     *         audio sources shall support the setting of the AudioSourceConfiguration through this
     *         command.
     *       
     */
    @WebMethod(operationName = "SetAudioSourceConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/SetAudioSourceConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "SetAudioSourceConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public SetAudioSourceConfigurationResponse setAudioSourceConfiguration(

        @WebParam(partName = "parameters", name = "SetAudioSourceConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        SetAudioSourceConfiguration parameters
    );

    /**
     * Modify an audio output configuration. A device that has one ore more audio
     *         outputs shall support the setting of the AudioOutputConfiguration through this command.
     *       
     */
    @WebMethod(operationName = "SetAudioOutputConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/SetAudioOutputConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "SetAudioOutputConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public SetAudioOutputConfigurationResponse setAudioOutputConfiguration(

        @WebParam(partName = "parameters", name = "SetAudioOutputConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        SetAudioOutputConfiguration parameters
    );

    @WebMethod(operationName = "GetSerialPorts", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetSerialPorts")
    @RequestWrapper(localName = "GetSerialPorts", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetSerialPorts")
    @ResponseWrapper(localName = "GetSerialPortsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetSerialPortsResponse")
    @WebResult(name = "SerialPort", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public java.util.List<org.onvif.ver10.deviceio.wsdl.SerialPort> getSerialPorts()
;

    /**
     * Request the current configuration of a physical Audio output. A device
     *         that has one or more AudioOutputs shall support the retrieval of the
     *         AudioOutputConfiguration through this command.
     *       
     */
    @WebMethod(operationName = "GetAudioOutputConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetAudioOutputConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetAudioOutputConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public GetAudioOutputConfigurationResponse getAudioOutputConfiguration(

        @WebParam(partName = "parameters", name = "GetAudioOutputConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        GetAudioOutputConfiguration parameters
    );

    /**
     * List the configuration of an Audio Input. A device with one or more audio
     *         inputs shall support the GetAudioSourceConfiguration command.
     *       
     */
    @WebMethod(operationName = "GetAudioSourceConfiguration", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetAudioSourceConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetAudioSourceConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public GetAudioSourceConfigurationResponse getAudioSourceConfiguration(

        @WebParam(partName = "parameters", name = "GetAudioSourceConfiguration", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        GetAudioSourceConfiguration parameters
    );

    /**
     * List all available video sources for the device. The device that has one
     *         or more video inputs shall support the listing of available video sources through the
     *         GetVideoSources command.
     *       
     */
    @WebMethod(operationName = "GetVideoSources", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetVideoSources")
    @RequestWrapper(localName = "GetVideoSources", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.Get")
    @ResponseWrapper(localName = "GetVideoSourcesResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetResponse")
    @WebResult(name = "Token", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public java.util.List<java.lang.String> getVideoSources()
;

    /**
     * List all available audio sources for the device. The device that has one
     *         or more audio sources shall support the listing of available audio inputs through the
     *         GetAudioSources command.
     *       
     */
    @WebMethod(operationName = "GetAudioSources", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetAudioSources")
    @RequestWrapper(localName = "GetAudioSources", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.Get")
    @ResponseWrapper(localName = "GetAudioSourcesResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", className = "org.onvif.ver10.deviceio.wsdl.GetResponse")
    @WebResult(name = "Token", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
    public java.util.List<java.lang.String> getAudioSources()
;

    /**
     * Request the VideoOutputConfigurationOptions of a VideoOutput. A device
     *         that has one or more video outputs shall support the retrieval of
     *         VideoOutputConfigurationOptions through this command.
     *       
     */
    @WebMethod(operationName = "GetVideoOutputConfigurationOptions", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetVideoOutputConfigurationOptions")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetVideoOutputConfigurationOptionsResponse", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl", partName = "parameters")
    public GetVideoOutputConfigurationOptionsResponse getVideoOutputConfigurationOptions(

        @WebParam(partName = "parameters", name = "GetVideoOutputConfigurationOptions", targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
        GetVideoOutputConfigurationOptions parameters
    );

    /**
     * This operation gets a list of all available relay outputs and their
     *         settings.
     *       
     */
    @WebMethod(operationName = "GetRelayOutputs", action = "http://www.onvif.org/ver10/deviceio/wsdl/GetRelayOutputs")
    @RequestWrapper(localName = "GetRelayOutputs", targetNamespace = "http://www.onvif.org/ver10/device/wsdl", className = "org.onvif.ver10.device.wsdl.GetRelayOutputs")
    @ResponseWrapper(localName = "GetRelayOutputsResponse", targetNamespace = "http://www.onvif.org/ver10/device/wsdl", className = "org.onvif.ver10.device.wsdl.GetRelayOutputsResponse")
    @WebResult(name = "RelayOutputs", targetNamespace = "http://www.onvif.org/ver10/device/wsdl")
    public java.util.List<org.onvif.ver10.schema.RelayOutput> getRelayOutputs()
;
}
