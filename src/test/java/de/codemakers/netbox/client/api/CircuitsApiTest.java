/*
 * NetBox API
 * API to access NetBox
 *
 * The version of the OpenAPI document: 3.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.codemakers.netbox.client.api;

import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.model.Circuit;
import de.codemakers.netbox.client.model.CircuitTermination;
import de.codemakers.netbox.client.model.CircuitType;
import de.codemakers.netbox.client.model.CircuitsCircuitTerminationsList200Response;
import de.codemakers.netbox.client.model.CircuitsCircuitTypesList200Response;
import de.codemakers.netbox.client.model.CircuitsCircuitsList200Response;
import de.codemakers.netbox.client.model.CircuitsProviderNetworksList200Response;
import de.codemakers.netbox.client.model.CircuitsProvidersList200Response;
import de.codemakers.netbox.client.model.Provider;
import de.codemakers.netbox.client.model.ProviderNetwork;
import de.codemakers.netbox.client.model.WritableCircuit;
import de.codemakers.netbox.client.model.WritableCircuitTermination;
import de.codemakers.netbox.client.model.WritableProvider;
import de.codemakers.netbox.client.model.WritableProviderNetwork;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for CircuitsApi
 */
@Ignore
public class CircuitsApiTest {

    private final CircuitsApi api = new CircuitsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsBulkDeleteTest() throws ApiException {
        
        api.circuitsCircuitTerminationsBulkDelete();
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsBulkPartialUpdateTest() throws ApiException {
        WritableCircuitTermination data = null;
        CircuitTermination response = 
        api.circuitsCircuitTerminationsBulkPartialUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsBulkUpdateTest() throws ApiException {
        WritableCircuitTermination data = null;
        CircuitTermination response = 
        api.circuitsCircuitTerminationsBulkUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsCreateTest() throws ApiException {
        WritableCircuitTermination data = null;
        CircuitTermination response = 
        api.circuitsCircuitTerminationsCreate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsDeleteTest() throws ApiException {
        Integer id = null;
        
        api.circuitsCircuitTerminationsDelete(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Overrides ListModelMixin to allow processing ExportTemplates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsListTest() throws ApiException {
        String id = null;
        String termSide = null;
        String portSpeed = null;
        String upstreamSpeed = null;
        String xconnectId = null;
        String description = null;
        String created = null;
        String createdGte = null;
        String createdLte = null;
        String lastUpdated = null;
        String lastUpdatedGte = null;
        String lastUpdatedLte = null;
        String cabled = null;
        String q = null;
        String circuitId = null;
        String siteId = null;
        String site = null;
        String providerNetworkId = null;
        String idN = null;
        String idLte = null;
        String idLt = null;
        String idGte = null;
        String idGt = null;
        String termSideN = null;
        String portSpeedN = null;
        String portSpeedLte = null;
        String portSpeedLt = null;
        String portSpeedGte = null;
        String portSpeedGt = null;
        String upstreamSpeedN = null;
        String upstreamSpeedLte = null;
        String upstreamSpeedLt = null;
        String upstreamSpeedGte = null;
        String upstreamSpeedGt = null;
        String xconnectIdN = null;
        String xconnectIdIc = null;
        String xconnectIdNic = null;
        String xconnectIdIew = null;
        String xconnectIdNiew = null;
        String xconnectIdIsw = null;
        String xconnectIdNisw = null;
        String xconnectIdIe = null;
        String xconnectIdNie = null;
        String descriptionN = null;
        String descriptionIc = null;
        String descriptionNic = null;
        String descriptionIew = null;
        String descriptionNiew = null;
        String descriptionIsw = null;
        String descriptionNisw = null;
        String descriptionIe = null;
        String descriptionNie = null;
        String circuitIdN = null;
        String siteIdN = null;
        String siteN = null;
        String providerNetworkIdN = null;
        Integer limit = null;
        Integer offset = null;
        CircuitsCircuitTerminationsList200Response response = 
        api.circuitsCircuitTerminationsList(id, termSide, portSpeed, upstreamSpeed, xconnectId, description, created, createdGte, createdLte, lastUpdated, lastUpdatedGte, lastUpdatedLte, cabled, q, circuitId, siteId, site, providerNetworkId, idN, idLte, idLt, idGte, idGt, termSideN, portSpeedN, portSpeedLte, portSpeedLt, portSpeedGte, portSpeedGt, upstreamSpeedN, upstreamSpeedLte, upstreamSpeedLt, upstreamSpeedGte, upstreamSpeedGt, xconnectIdN, xconnectIdIc, xconnectIdNic, xconnectIdIew, xconnectIdNiew, xconnectIdIsw, xconnectIdNisw, xconnectIdIe, xconnectIdNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, circuitIdN, siteIdN, siteN, providerNetworkIdN, limit, offset);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsPartialUpdateTest() throws ApiException {
        Integer id = null;
        WritableCircuitTermination data = null;
        CircuitTermination response = 
        api.circuitsCircuitTerminationsPartialUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Return all CablePaths which traverse a given pass-through port.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsPathsTest() throws ApiException {
        Integer id = null;
        CircuitTermination response = 
        api.circuitsCircuitTerminationsPaths(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsReadTest() throws ApiException {
        Integer id = null;
        CircuitTermination response = 
        api.circuitsCircuitTerminationsRead(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTerminationsUpdateTest() throws ApiException {
        Integer id = null;
        WritableCircuitTermination data = null;
        CircuitTermination response = 
        api.circuitsCircuitTerminationsUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesBulkDeleteTest() throws ApiException {
        
        api.circuitsCircuitTypesBulkDelete();
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesBulkPartialUpdateTest() throws ApiException {
        CircuitType data = null;
        CircuitType response = 
        api.circuitsCircuitTypesBulkPartialUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesBulkUpdateTest() throws ApiException {
        CircuitType data = null;
        CircuitType response = 
        api.circuitsCircuitTypesBulkUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesCreateTest() throws ApiException {
        CircuitType data = null;
        CircuitType response = 
        api.circuitsCircuitTypesCreate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesDeleteTest() throws ApiException {
        Integer id = null;
        
        api.circuitsCircuitTypesDelete(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Overrides ListModelMixin to allow processing ExportTemplates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesListTest() throws ApiException {
        String id = null;
        String name = null;
        String slug = null;
        String description = null;
        String created = null;
        String createdGte = null;
        String createdLte = null;
        String lastUpdated = null;
        String lastUpdatedGte = null;
        String lastUpdatedLte = null;
        String q = null;
        String tag = null;
        String idN = null;
        String idLte = null;
        String idLt = null;
        String idGte = null;
        String idGt = null;
        String nameN = null;
        String nameIc = null;
        String nameNic = null;
        String nameIew = null;
        String nameNiew = null;
        String nameIsw = null;
        String nameNisw = null;
        String nameIe = null;
        String nameNie = null;
        String slugN = null;
        String slugIc = null;
        String slugNic = null;
        String slugIew = null;
        String slugNiew = null;
        String slugIsw = null;
        String slugNisw = null;
        String slugIe = null;
        String slugNie = null;
        String descriptionN = null;
        String descriptionIc = null;
        String descriptionNic = null;
        String descriptionIew = null;
        String descriptionNiew = null;
        String descriptionIsw = null;
        String descriptionNisw = null;
        String descriptionIe = null;
        String descriptionNie = null;
        String tagN = null;
        Integer limit = null;
        Integer offset = null;
        CircuitsCircuitTypesList200Response response = 
        api.circuitsCircuitTypesList(id, name, slug, description, created, createdGte, createdLte, lastUpdated, lastUpdatedGte, lastUpdatedLte, q, tag, idN, idLte, idLt, idGte, idGt, nameN, nameIc, nameNic, nameIew, nameNiew, nameIsw, nameNisw, nameIe, nameNie, slugN, slugIc, slugNic, slugIew, slugNiew, slugIsw, slugNisw, slugIe, slugNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, tagN, limit, offset);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesPartialUpdateTest() throws ApiException {
        Integer id = null;
        CircuitType data = null;
        CircuitType response = 
        api.circuitsCircuitTypesPartialUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesReadTest() throws ApiException {
        Integer id = null;
        CircuitType response = 
        api.circuitsCircuitTypesRead(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitTypesUpdateTest() throws ApiException {
        Integer id = null;
        CircuitType data = null;
        CircuitType response = 
        api.circuitsCircuitTypesUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsBulkDeleteTest() throws ApiException {
        
        api.circuitsCircuitsBulkDelete();
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsBulkPartialUpdateTest() throws ApiException {
        WritableCircuit data = null;
        Circuit response = 
        api.circuitsCircuitsBulkPartialUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsBulkUpdateTest() throws ApiException {
        WritableCircuit data = null;
        Circuit response = 
        api.circuitsCircuitsBulkUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsCreateTest() throws ApiException {
        WritableCircuit data = null;
        Circuit response = 
        api.circuitsCircuitsCreate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsDeleteTest() throws ApiException {
        Integer id = null;
        
        api.circuitsCircuitsDelete(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Overrides ListModelMixin to allow processing ExportTemplates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsListTest() throws ApiException {
        String id = null;
        String cid = null;
        String description = null;
        String installDate = null;
        String commitRate = null;
        String created = null;
        String createdGte = null;
        String createdLte = null;
        String lastUpdated = null;
        String lastUpdatedGte = null;
        String lastUpdatedLte = null;
        String q = null;
        String tag = null;
        String tenantGroupId = null;
        String tenantGroup = null;
        String tenantId = null;
        String tenant = null;
        String contact = null;
        String contactRole = null;
        String contactGroup = null;
        String providerId = null;
        String provider = null;
        String providerNetworkId = null;
        String typeId = null;
        String type = null;
        String status = null;
        String regionId = null;
        String region = null;
        String siteGroupId = null;
        String siteGroup = null;
        String siteId = null;
        String site = null;
        String idN = null;
        String idLte = null;
        String idLt = null;
        String idGte = null;
        String idGt = null;
        String cidN = null;
        String cidIc = null;
        String cidNic = null;
        String cidIew = null;
        String cidNiew = null;
        String cidIsw = null;
        String cidNisw = null;
        String cidIe = null;
        String cidNie = null;
        String descriptionN = null;
        String descriptionIc = null;
        String descriptionNic = null;
        String descriptionIew = null;
        String descriptionNiew = null;
        String descriptionIsw = null;
        String descriptionNisw = null;
        String descriptionIe = null;
        String descriptionNie = null;
        String installDateN = null;
        String installDateLte = null;
        String installDateLt = null;
        String installDateGte = null;
        String installDateGt = null;
        String commitRateN = null;
        String commitRateLte = null;
        String commitRateLt = null;
        String commitRateGte = null;
        String commitRateGt = null;
        String tagN = null;
        String tenantGroupIdN = null;
        String tenantGroupN = null;
        String tenantIdN = null;
        String tenantN = null;
        String contactN = null;
        String contactRoleN = null;
        String contactGroupN = null;
        String providerIdN = null;
        String providerN = null;
        String providerNetworkIdN = null;
        String typeIdN = null;
        String typeN = null;
        String statusN = null;
        String regionIdN = null;
        String regionN = null;
        String siteGroupIdN = null;
        String siteGroupN = null;
        String siteIdN = null;
        String siteN = null;
        Integer limit = null;
        Integer offset = null;
        CircuitsCircuitsList200Response response = 
        api.circuitsCircuitsList(id, cid, description, installDate, commitRate, created, createdGte, createdLte, lastUpdated, lastUpdatedGte, lastUpdatedLte, q, tag, tenantGroupId, tenantGroup, tenantId, tenant, contact, contactRole, contactGroup, providerId, provider, providerNetworkId, typeId, type, status, regionId, region, siteGroupId, siteGroup, siteId, site, idN, idLte, idLt, idGte, idGt, cidN, cidIc, cidNic, cidIew, cidNiew, cidIsw, cidNisw, cidIe, cidNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, installDateN, installDateLte, installDateLt, installDateGte, installDateGt, commitRateN, commitRateLte, commitRateLt, commitRateGte, commitRateGt, tagN, tenantGroupIdN, tenantGroupN, tenantIdN, tenantN, contactN, contactRoleN, contactGroupN, providerIdN, providerN, providerNetworkIdN, typeIdN, typeN, statusN, regionIdN, regionN, siteGroupIdN, siteGroupN, siteIdN, siteN, limit, offset);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsPartialUpdateTest() throws ApiException {
        Integer id = null;
        WritableCircuit data = null;
        Circuit response = 
        api.circuitsCircuitsPartialUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsReadTest() throws ApiException {
        Integer id = null;
        Circuit response = 
        api.circuitsCircuitsRead(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsCircuitsUpdateTest() throws ApiException {
        Integer id = null;
        WritableCircuit data = null;
        Circuit response = 
        api.circuitsCircuitsUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksBulkDeleteTest() throws ApiException {
        
        api.circuitsProviderNetworksBulkDelete();
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksBulkPartialUpdateTest() throws ApiException {
        WritableProviderNetwork data = null;
        ProviderNetwork response = 
        api.circuitsProviderNetworksBulkPartialUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksBulkUpdateTest() throws ApiException {
        WritableProviderNetwork data = null;
        ProviderNetwork response = 
        api.circuitsProviderNetworksBulkUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksCreateTest() throws ApiException {
        WritableProviderNetwork data = null;
        ProviderNetwork response = 
        api.circuitsProviderNetworksCreate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksDeleteTest() throws ApiException {
        Integer id = null;
        
        api.circuitsProviderNetworksDelete(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Overrides ListModelMixin to allow processing ExportTemplates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksListTest() throws ApiException {
        String id = null;
        String name = null;
        String serviceId = null;
        String description = null;
        String created = null;
        String createdGte = null;
        String createdLte = null;
        String lastUpdated = null;
        String lastUpdatedGte = null;
        String lastUpdatedLte = null;
        String q = null;
        String tag = null;
        String providerId = null;
        String provider = null;
        String idN = null;
        String idLte = null;
        String idLt = null;
        String idGte = null;
        String idGt = null;
        String nameN = null;
        String nameIc = null;
        String nameNic = null;
        String nameIew = null;
        String nameNiew = null;
        String nameIsw = null;
        String nameNisw = null;
        String nameIe = null;
        String nameNie = null;
        String serviceIdN = null;
        String serviceIdIc = null;
        String serviceIdNic = null;
        String serviceIdIew = null;
        String serviceIdNiew = null;
        String serviceIdIsw = null;
        String serviceIdNisw = null;
        String serviceIdIe = null;
        String serviceIdNie = null;
        String descriptionN = null;
        String descriptionIc = null;
        String descriptionNic = null;
        String descriptionIew = null;
        String descriptionNiew = null;
        String descriptionIsw = null;
        String descriptionNisw = null;
        String descriptionIe = null;
        String descriptionNie = null;
        String tagN = null;
        String providerIdN = null;
        String providerN = null;
        Integer limit = null;
        Integer offset = null;
        CircuitsProviderNetworksList200Response response = 
        api.circuitsProviderNetworksList(id, name, serviceId, description, created, createdGte, createdLte, lastUpdated, lastUpdatedGte, lastUpdatedLte, q, tag, providerId, provider, idN, idLte, idLt, idGte, idGt, nameN, nameIc, nameNic, nameIew, nameNiew, nameIsw, nameNisw, nameIe, nameNie, serviceIdN, serviceIdIc, serviceIdNic, serviceIdIew, serviceIdNiew, serviceIdIsw, serviceIdNisw, serviceIdIe, serviceIdNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, tagN, providerIdN, providerN, limit, offset);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksPartialUpdateTest() throws ApiException {
        Integer id = null;
        WritableProviderNetwork data = null;
        ProviderNetwork response = 
        api.circuitsProviderNetworksPartialUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksReadTest() throws ApiException {
        Integer id = null;
        ProviderNetwork response = 
        api.circuitsProviderNetworksRead(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProviderNetworksUpdateTest() throws ApiException {
        Integer id = null;
        WritableProviderNetwork data = null;
        ProviderNetwork response = 
        api.circuitsProviderNetworksUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersBulkDeleteTest() throws ApiException {
        
        api.circuitsProvidersBulkDelete();
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersBulkPartialUpdateTest() throws ApiException {
        WritableProvider data = null;
        Provider response = 
        api.circuitsProvidersBulkPartialUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersBulkUpdateTest() throws ApiException {
        WritableProvider data = null;
        Provider response = 
        api.circuitsProvidersBulkUpdate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersCreateTest() throws ApiException {
        WritableProvider data = null;
        Provider response = 
        api.circuitsProvidersCreate(data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersDeleteTest() throws ApiException {
        Integer id = null;
        
        api.circuitsProvidersDelete(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Overrides ListModelMixin to allow processing ExportTemplates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersListTest() throws ApiException {
        String id = null;
        String name = null;
        String slug = null;
        String asn = null;
        String account = null;
        String created = null;
        String createdGte = null;
        String createdLte = null;
        String lastUpdated = null;
        String lastUpdatedGte = null;
        String lastUpdatedLte = null;
        String q = null;
        String tag = null;
        String contact = null;
        String contactRole = null;
        String contactGroup = null;
        String regionId = null;
        String region = null;
        String siteGroupId = null;
        String siteGroup = null;
        String siteId = null;
        String site = null;
        String asnId = null;
        String idN = null;
        String idLte = null;
        String idLt = null;
        String idGte = null;
        String idGt = null;
        String nameN = null;
        String nameIc = null;
        String nameNic = null;
        String nameIew = null;
        String nameNiew = null;
        String nameIsw = null;
        String nameNisw = null;
        String nameIe = null;
        String nameNie = null;
        String slugN = null;
        String slugIc = null;
        String slugNic = null;
        String slugIew = null;
        String slugNiew = null;
        String slugIsw = null;
        String slugNisw = null;
        String slugIe = null;
        String slugNie = null;
        String asnN = null;
        String asnLte = null;
        String asnLt = null;
        String asnGte = null;
        String asnGt = null;
        String accountN = null;
        String accountIc = null;
        String accountNic = null;
        String accountIew = null;
        String accountNiew = null;
        String accountIsw = null;
        String accountNisw = null;
        String accountIe = null;
        String accountNie = null;
        String tagN = null;
        String contactN = null;
        String contactRoleN = null;
        String contactGroupN = null;
        String regionIdN = null;
        String regionN = null;
        String siteGroupIdN = null;
        String siteGroupN = null;
        String siteIdN = null;
        String siteN = null;
        String asnIdN = null;
        Integer limit = null;
        Integer offset = null;
        CircuitsProvidersList200Response response = 
        api.circuitsProvidersList(id, name, slug, asn, account, created, createdGte, createdLte, lastUpdated, lastUpdatedGte, lastUpdatedLte, q, tag, contact, contactRole, contactGroup, regionId, region, siteGroupId, siteGroup, siteId, site, asnId, idN, idLte, idLt, idGte, idGt, nameN, nameIc, nameNic, nameIew, nameNiew, nameIsw, nameNisw, nameIe, nameNie, slugN, slugIc, slugNic, slugIew, slugNiew, slugIsw, slugNisw, slugIe, slugNie, asnN, asnLte, asnLt, asnGte, asnGt, accountN, accountIc, accountNic, accountIew, accountNiew, accountIsw, accountNisw, accountIe, accountNie, tagN, contactN, contactRoleN, contactGroupN, regionIdN, regionN, siteGroupIdN, siteGroupN, siteIdN, siteN, asnIdN, limit, offset);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersPartialUpdateTest() throws ApiException {
        Integer id = null;
        WritableProvider data = null;
        Provider response = 
        api.circuitsProvidersPartialUpdate(id, data);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersReadTest() throws ApiException {
        Integer id = null;
        Provider response = 
        api.circuitsProvidersRead(id);
        
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void circuitsProvidersUpdateTest() throws ApiException {
        Integer id = null;
        WritableProvider data = null;
        Provider response = 
        api.circuitsProvidersUpdate(id, data);
        
        // TODO: test validations
    }
    
}
