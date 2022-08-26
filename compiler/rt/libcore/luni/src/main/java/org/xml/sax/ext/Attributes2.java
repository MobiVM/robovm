// Attributes2.java - extended Attributes
// http://www.saxproject.org
// Public Domain: no warranty.
// $Id: Attributes2.java,v 1.6 2004/03/08 13:01:00 dmegginson Exp $

package org.xml.sax.ext;

import org.xml.sax.Attributes;


/**
 * SAX2 extension to augment the per-attribute information
 * provided though {@link Attributes}.
 * If an implementation supports this extension, the attributes
 * provided in {@link org.xml.sax.ContentHandler#startElement
 * ContentHandler.startElement() } will implement this interface,
 * and the <em>http://xml.org/sax/features/use-attributes2</em>
 * feature flag will have the value <em>true</em>.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * </blockquote>
 *
 * <p> XMLReader implementations are not required to support this
 * information, and it is not part of core-only SAX2 distributions.</p>
 *
 * <p>Note that if an attribute was defaulted (<em>!isSpecified()</em>)
 * it will of necessity also have been declared (<em>isDeclared()</em>)
 * in the DTD.
 * Similarly if an attribute's type is anything except CDATA, then it
 * must have been declared.
 * </p>
 *
 * @since SAX 2.0 (extensions 1.1 alpha)
 * @author David Brownell
 * @version TBS
 */
public interface Attributes2 extends Attributes
{
    /**
     * Returns false unless the attribute was declared in the DTD.
     * This helps distinguish two kinds of attributes that SAX reports
     * as CDATA:  ones that were declared (and hence are usually valid),
     * and those that were not (and which are never valid).
     *
     * @param index The attribute index (zero-based).
     * @return true if the attribute was declared in the DTD,
     *        false otherwise.
     * @exception java.lang.ArrayIndexOutOfBoundsException When the
     *            supplied index does not identify an attribute.
     */
    public boolean isDeclared (int index);

    /**
     * Returns false unless the attribute was declared in the DTD.
     * This helps distinguish two kinds of attributes that SAX reports
     * as CDATA:  ones that were declared (and hence are usually valid),
     * and those that were not (and which are never valid).
     *
     * @param qName The XML qualified (prefixed) name.
     * @return true if the attribute was declared in the DTD,
     *        false otherwise.
     * @exception java.lang.IllegalArgumentException When the
     *            supplied name does not identify an attribute.
     */
    public boolean isDeclared (String qName);

    /**
     * Returns false unless the attribute was declared in the DTD.
     * This helps distinguish two kinds of attributes that SAX reports
     * as CDATA:  ones that were declared (and hence are usually valid),
     * and those that were not (and which are never valid).
     *
     * <p>Remember that since DTDs do not "understand" namespaces, the
     * namespace URI associated with an attribute may not have come from
     * the DTD.  The declaration will have applied to the attribute's
     * <em>qName</em>.
     *
     * @param uri The Namespace URI, or the empty string if
     *        the name has no Namespace URI.
     * @param localName The attribute's local name.
     * @return true if the attribute was declared in the DTD,
     *        false otherwise.
     * @exception java.lang.IllegalArgumentException When the
     *            supplied names do not identify an attribute.
     */
    public boolean isDeclared (String uri, String localName);

    /**
     * Returns true unless the attribute value was provided
     * by DTD defaulting.
     *
     * @param index The attribute index (zero-based).
     * @return true if the value was found in the XML text,
     *        false if the value was provided by DTD defaulting.
     * @exception java.lang.ArrayIndexOutOfBoundsException When the
     *            supplied index does not identify an attribute.
     */
    public boolean isSpecified (int index);

    /**
     * Returns true unless the attribute value was provided
     * by DTD defaulting.
     *
     * <p>Remember that since DTDs do not "understand" namespaces, the
     * namespace URI associated with an attribute may not have come from
     * the DTD.  The declaration will have applied to the attribute's
     * <em>qName</em>.
     *
     * @param uri The Namespace URI, or the empty string if
     *        the name has no Namespace URI.
     * @param localName The attribute's local name.
     * @return true if the value was found in the XML text,
     *        false if the value was provided by DTD defaulting.
     * @exception java.lang.IllegalArgumentException When the
     *            supplied names do not identify an attribute.
     */
    public boolean isSpecified (String uri, String localName);

    /**
     * Returns true unless the attribute value was provided
     * by DTD defaulting.
     *
     * @param qName The XML qualified (prefixed) name.
     * @return true if the value was found in the XML text,
     *        false if the value was provided by DTD defaulting.
     * @exception java.lang.IllegalArgumentException When the
     *            supplied name does not identify an attribute.
     */
    public boolean isSpecified (String qName);
}
