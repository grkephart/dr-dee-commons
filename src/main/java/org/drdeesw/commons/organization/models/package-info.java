/**
 * The set of interfaces and classes that define the organizational structure of an organization.
 * For each interface, there are a corresponding entity class and POJO class that implements the interface.
 * This allows use of a model mapper to convert between the entity and POJO classes.
 * For each concrete entity class there is a corresponding abstract class that provides the basic implementation of the interface.
 * This allows multiple concrete entity classes to share common code but use different values for annotations like Table.
 */
package org.drdeesw.commons.organization.models;
