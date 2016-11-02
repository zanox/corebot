package com.gatehill.rundeckbot.config

/**
 * Holds the security configuration.
 *
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
data class SecurityConfig(val roles: Map<String, SecurityRoleConfig>,
                          val users: Map<String, SecurityUserConfig>)
