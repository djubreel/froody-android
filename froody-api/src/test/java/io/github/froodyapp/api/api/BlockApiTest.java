/*
 * Froody API
 * API for Froody - http://froody-app.at/
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.froodyapp.api.api;

import io.github.froodyapp.api.invoker.ApiException;
import io.github.froodyapp.api.model_.BlockInfo;
import org.joda.time.DateTime;
import io.github.froodyapp.api.model_.FroodyEntry;
import io.github.froodyapp.api.model_.ResponseOk;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockApi
 */
@Ignore
public class BlockApiTest {

    private final BlockApi api = new BlockApi();

    
    /**
     * 
     *
     * Entry[ ] ** Get entries contained in block
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockGetGetTest() throws ApiException {
        String geohash = null;
        DateTime minModificationDate = null;
        List<FroodyEntry> response = api.blockGetGet(geohash, minModificationDate);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get informations about of or around block/geohash
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockInfoGetTest() throws ApiException {
        String geohash = null;
        DateTime minModificationDate = null;
        List<BlockInfo> response = api.blockInfoGet(geohash, minModificationDate);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get informations about random geohashes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockInfoRandomGetTest() throws ApiException {
        List<BlockInfo> response = api.blockInfoRandomGet();

        // TODO: test validations
    }
    
}