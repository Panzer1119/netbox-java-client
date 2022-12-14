/*
 * NetBox API
 * API to access NetBox
 *
 * The version of the OpenAPI document: 3.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.codemakers.netbox.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.codemakers.netbox.client.model.ComponentNestedModule;
import de.codemakers.netbox.client.model.Duplex;
import de.codemakers.netbox.client.model.Mode;
import de.codemakers.netbox.client.model.NestedCable;
import de.codemakers.netbox.client.model.NestedDevice;
import de.codemakers.netbox.client.model.NestedInterface;
import de.codemakers.netbox.client.model.NestedL2VPNTermination;
import de.codemakers.netbox.client.model.NestedTag;
import de.codemakers.netbox.client.model.NestedVLAN;
import de.codemakers.netbox.client.model.NestedVRF;
import de.codemakers.netbox.client.model.NestedWirelessLAN;
import de.codemakers.netbox.client.model.NestedWirelessLink;
import de.codemakers.netbox.client.model.PoeMode;
import de.codemakers.netbox.client.model.PoeType;
import de.codemakers.netbox.client.model.RfChannel;
import de.codemakers.netbox.client.model.RfRole;
import de.codemakers.netbox.client.model.Type2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ModelInterface
 */
public class ModelInterfaceTest {
    private final ModelInterface model = new ModelInterface();

    /**
     * Model tests for ModelInterface
     */
    @Test
    public void testModelInterface() {
        // TODO: test ModelInterface
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

    /**
     * Test the property 'display'
     */
    @Test
    public void displayTest() {
        // TODO: test display
    }

    /**
     * Test the property 'device'
     */
    @Test
    public void deviceTest() {
        // TODO: test device
    }

    /**
     * Test the property 'module'
     */
    @Test
    public void moduleTest() {
        // TODO: test module
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'label'
     */
    @Test
    public void labelTest() {
        // TODO: test label
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'parent'
     */
    @Test
    public void parentTest() {
        // TODO: test parent
    }

    /**
     * Test the property 'bridge'
     */
    @Test
    public void bridgeTest() {
        // TODO: test bridge
    }

    /**
     * Test the property 'lag'
     */
    @Test
    public void lagTest() {
        // TODO: test lag
    }

    /**
     * Test the property 'mtu'
     */
    @Test
    public void mtuTest() {
        // TODO: test mtu
    }

    /**
     * Test the property 'macAddress'
     */
    @Test
    public void macAddressTest() {
        // TODO: test macAddress
    }

    /**
     * Test the property 'speed'
     */
    @Test
    public void speedTest() {
        // TODO: test speed
    }

    /**
     * Test the property 'duplex'
     */
    @Test
    public void duplexTest() {
        // TODO: test duplex
    }

    /**
     * Test the property 'wwn'
     */
    @Test
    public void wwnTest() {
        // TODO: test wwn
    }

    /**
     * Test the property 'mgmtOnly'
     */
    @Test
    public void mgmtOnlyTest() {
        // TODO: test mgmtOnly
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'mode'
     */
    @Test
    public void modeTest() {
        // TODO: test mode
    }

    /**
     * Test the property 'rfRole'
     */
    @Test
    public void rfRoleTest() {
        // TODO: test rfRole
    }

    /**
     * Test the property 'rfChannel'
     */
    @Test
    public void rfChannelTest() {
        // TODO: test rfChannel
    }

    /**
     * Test the property 'poeMode'
     */
    @Test
    public void poeModeTest() {
        // TODO: test poeMode
    }

    /**
     * Test the property 'poeType'
     */
    @Test
    public void poeTypeTest() {
        // TODO: test poeType
    }

    /**
     * Test the property 'rfChannelFrequency'
     */
    @Test
    public void rfChannelFrequencyTest() {
        // TODO: test rfChannelFrequency
    }

    /**
     * Test the property 'rfChannelWidth'
     */
    @Test
    public void rfChannelWidthTest() {
        // TODO: test rfChannelWidth
    }

    /**
     * Test the property 'txPower'
     */
    @Test
    public void txPowerTest() {
        // TODO: test txPower
    }

    /**
     * Test the property 'untaggedVlan'
     */
    @Test
    public void untaggedVlanTest() {
        // TODO: test untaggedVlan
    }

    /**
     * Test the property 'taggedVlans'
     */
    @Test
    public void taggedVlansTest() {
        // TODO: test taggedVlans
    }

    /**
     * Test the property 'markConnected'
     */
    @Test
    public void markConnectedTest() {
        // TODO: test markConnected
    }

    /**
     * Test the property 'cable'
     */
    @Test
    public void cableTest() {
        // TODO: test cable
    }

    /**
     * Test the property 'cableEnd'
     */
    @Test
    public void cableEndTest() {
        // TODO: test cableEnd
    }

    /**
     * Test the property 'wirelessLink'
     */
    @Test
    public void wirelessLinkTest() {
        // TODO: test wirelessLink
    }

    /**
     * Test the property 'linkPeers'
     */
    @Test
    public void linkPeersTest() {
        // TODO: test linkPeers
    }

    /**
     * Test the property 'linkPeersType'
     */
    @Test
    public void linkPeersTypeTest() {
        // TODO: test linkPeersType
    }

    /**
     * Test the property 'wirelessLans'
     */
    @Test
    public void wirelessLansTest() {
        // TODO: test wirelessLans
    }

    /**
     * Test the property 'vrf'
     */
    @Test
    public void vrfTest() {
        // TODO: test vrf
    }

    /**
     * Test the property 'l2vpnTermination'
     */
    @Test
    public void l2vpnTerminationTest() {
        // TODO: test l2vpnTermination
    }

    /**
     * Test the property 'connectedEndpoints'
     */
    @Test
    public void connectedEndpointsTest() {
        // TODO: test connectedEndpoints
    }

    /**
     * Test the property 'connectedEndpointsType'
     */
    @Test
    public void connectedEndpointsTypeTest() {
        // TODO: test connectedEndpointsType
    }

    /**
     * Test the property 'connectedEndpointsReachable'
     */
    @Test
    public void connectedEndpointsReachableTest() {
        // TODO: test connectedEndpointsReachable
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'customFields'
     */
    @Test
    public void customFieldsTest() {
        // TODO: test customFields
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'lastUpdated'
     */
    @Test
    public void lastUpdatedTest() {
        // TODO: test lastUpdated
    }

    /**
     * Test the property 'countIpaddresses'
     */
    @Test
    public void countIpaddressesTest() {
        // TODO: test countIpaddresses
    }

    /**
     * Test the property 'countFhrpGroups'
     */
    @Test
    public void countFhrpGroupsTest() {
        // TODO: test countFhrpGroups
    }

    /**
     * Test the property 'occupied'
     */
    @Test
    public void occupiedTest() {
        // TODO: test occupied
    }

}
