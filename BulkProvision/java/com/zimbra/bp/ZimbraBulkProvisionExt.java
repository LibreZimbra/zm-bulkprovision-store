/*
 * ***** BEGIN LICENSE BLOCK *****
 * 
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2008 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Yahoo! Public License
 * Version 1.0 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * 
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.bp;

import com.zimbra.common.service.ServiceException;
import com.zimbra.soap.SoapServlet;
import com.zimbra.cs.extension.ZimbraExtension;

/**
 * Created by IntelliJ IDEA.
 * User: ccao
 * Date: Sep 11, 2008
 * Time: 10:56:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class ZimbraBulkProvisionExt implements ZimbraExtension {

    public static final String EXTENSION_NAME_BULKPROVISION = "com_zimbra_bulkprovision";

    public void destroy() {
    }

    public String getName() {
        return EXTENSION_NAME_BULKPROVISION ;
    }

    public void init() throws ServiceException {
        //need to add the service calls to the admin soap calls
        SoapServlet.addService("AdminServlet", new ZimbraBulkProvisionService());
    }
               
    
}
