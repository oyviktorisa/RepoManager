package com.viktorisa.frmltrx;

import java.util.HashMap;
import java.util.Map;

import com.viktorisa.frmltrx.model.Repository;
import com.viktorisa.frmltrx.validator.RepositoryValidator;

public class RepositoryManager
{
    private static RepositoryManager rm;
    
    private Map<String, Repository> repoMap;
    
    private RepositoryManager() {
        repoMap = new HashMap<String, Repository>();
    }
    
    public static RepositoryManager Initialize() {
        if(rm == null) {
            rm = new RepositoryManager();
        }
        
        return rm;
    }
    
    public void Register(String itemName, String itemContent, int itemType) throws Exception {
        RepositoryValidator.validate (itemName, itemContent, itemType);
        
        if(repoMap.containsKey (itemName)) {
            throw new Exception ("Item name already exists");
        }
        
        repoMap.put (itemName, new Repository(itemName, itemType, itemContent));
    }
    
    public String Retrieve(String itemName) throws Exception{
        if(!repoMap.containsKey (itemName)) {
            throw new Exception ("Item name does not exists");
        }
        
        return repoMap.get (itemName).getContent ();
    }
    
    public int GetType(String itemName) throws Exception{
        if(!repoMap.containsKey (itemName)) {
            throw new Exception ("Item name does not exists");
        }
        
        return repoMap.get (itemName).getType ();
    }
    
    public void Deregister(String itemName) throws Exception{
        if(!repoMap.containsKey (itemName)) {
            throw new Exception ("Item name does not exists");
        }
        
        repoMap.remove (itemName);
    }
}
