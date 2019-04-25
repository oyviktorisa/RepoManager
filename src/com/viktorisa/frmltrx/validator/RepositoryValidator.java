package com.viktorisa.frmltrx.validator;

import com.viktorisa.frmltrx.model.Repository;

public class RepositoryValidator
{
    public static void validate(String itemName, String itemContent, int itemType) throws Exception {
        if(itemName==null || itemName.isEmpty ()) {
            throw new Exception ("Value cannot be null");
        }
        
        if(itemContent==null || itemContent.isEmpty ()) {
            throw new Exception ("Value cannot be null");
        }
        
        if(itemType != Repository.TYPE_JSON
                && itemType != Repository.TYPE_XML) {
            throw new Exception ("Value must be valid");
        }
        
        if(itemType == Repository.TYPE_JSON
                && !validateJSONFormat(itemContent)) {
            throw new Exception ("Value must be valid");
        }
        
        if(itemType == Repository.TYPE_XML
                && !validateXMLFormat(itemContent)) {
            throw new Exception ("Value must be valid");
        }
            
    }
    
    private static boolean validateJSONFormat(String json) {
        //TODO implement logic
        return true;
    }
    
    private static boolean validateXMLFormat(String xml) {
        //TODO implement logic
        return true;
    }
}
