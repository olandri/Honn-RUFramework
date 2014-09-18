/**
 * RU Framework
 * This class or interface is part of a Framework used in cource
 * T-302-HONN, Design and Implementation at Reykjavik University.
 */

package is.ruframework.domain;

import java.util.logging.Logger;

/**
 * Base class for Framework classes. This is a Layer supertype
 * Provides a log object that subclasses can use.
 */
public class RuObject
{
  /**
   * Logger which is named by the class that is using it
   */
  protected Logger log = Logger.getLogger(this.getClass().getSimpleName());

} // RuObject
