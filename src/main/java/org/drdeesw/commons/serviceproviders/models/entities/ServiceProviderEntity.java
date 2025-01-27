/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.EmbeddedAuditable;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_providers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class ServiceProviderEntity
    extends AbstractServiceProviderEntity<ServiceProviderAccountEntity>
{
  private Set<ServiceProviderAccountEntity> providedAccounts;

  /**
   * Hibernate
   */
  public ServiceProviderEntity()
  {
  }


  /**
   * Unit testing.
   * 
   * @param audit 
   */
  public ServiceProviderEntity(EmbeddedAuditable audit)
  {
    super(audit);
  }


  @Override
  @Column(name = "service_provider_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<ServiceProviderAccountEntity> getProvidedAccounts()
  {
    return providedAccounts == null ? Set.of() : new HashSet<>(this.providedAccounts);
  }


  @Override
  public void setProvidedAccounts(
    Set<ServiceProviderAccountEntity> accounts)
  {
    this.providedAccounts = accounts;
  }

}
