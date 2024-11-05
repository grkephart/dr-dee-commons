/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


/**
 * The authentication type of a service provider. This enum is used to determine the type of authentication required to access a service provider's API. Examples include API key, OAuth 2.0, and JWT.
 */
public enum AuthenticationType {
  NONE, //No authentication is required.
  API_KEY, //Authentication through an API key, often passed in headers or query parameters.
  BASIC_AUTH, // Basic HTTP Authentication with a username and password, usually encoded in Base64.
  OAUTH1, // OAuth 1.0, which uses a consumer key and secret, along with token-based authentication.
  OAUTH2, // OAuth 2.0, which provides multiple grant types (e.g., Authorization Code, Client Credentials, etc.) and uses access tokens to authenticate.
  JWT, // JSON Web Token-based authentication, where a token is generated and passed in requests (often used for stateless authentication).
  SAML, // Security Assertion Markup Language, often used for single sign-on (SSO) in enterprise environments.
  OPENID_CONNECT, // An authentication layer on top of OAuth 2.0, primarily used for verifying user identity in addition to authorization.
  DIGITAL_SIGNATURE, // Authentication using digital signatures (e.g., RSA) for verification, common in secure APIs.
  LDAP, // Lightweight Directory Access Protocol, generally used within organizations to authenticate via a directory service.
  SESSION;// Session-based authentication, where a session ID is stored and used to track user state on the server.
}
