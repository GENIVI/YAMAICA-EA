/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal.containers;

import org.eclipse.core.runtime.Assert;
import org.sparx.ConnectorTag;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.IRunnableWithArguments;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EAConnectorTagContainer;

public class EAConnectorTagContainerImpl extends EAContainerImpl implements EAConnectorTagContainer
{
    protected final ConnectorTag eaConnectorTag;

    protected EAConnectorTagContainerImpl(EAInstance eaInstance, ConnectorTag eaConnectorTag)
    {
        super(eaInstance, eaInstance.getRepository().getEAObjectId(eaConnectorTag));

        Assert.isNotNull(eaConnectorTag);

        this.eaConnectorTag = eaConnectorTag;
    }

    // BEGIN Implementation of interface EAContainer //

    @Override
    public Object getEAObject()
    {
        return eaConnectorTag;
    }

    @Override
    public String getName()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnectorTag.GetName();
            }
        });
    }

    @Override
    public String getNotes()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnectorTag.GetNotes();
            }
        });
    }

    @Override
    public boolean update()
    {
        return (Boolean) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnectorTag.Update();
            }
        });
    }

    // END Implementation of interface EAContainer //

    // BEGIN Implementation of interface EAConnectorTagContainer //

    @Override
    public String getValue()
    {
        return (String) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnectorTag.GetValue();
            }
        });
    }

    @Override
    public EAConnectorContainer getConnector()
    {
        int connectorId = (Integer) eaInstance.syncExecution(new IRunnableWithArguments()
        {
            @Override
            public Object run(Object... arguments)
            {
                return eaConnectorTag.GetConnectorID();
            }
        });

        return getRepository().getOrCreateEAObjectContainerById(connectorId, EAConnectorContainer.class, this);
    }

    // END Implementation of interface EAConnectorTagContainer //
}