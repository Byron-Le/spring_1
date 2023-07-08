package org.example;

import org.springframework.beans.factory.FactoryBean;

public class personFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        person person = new person();
        person.setName("personFactoryBean");
        person.setAge(495488);
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
