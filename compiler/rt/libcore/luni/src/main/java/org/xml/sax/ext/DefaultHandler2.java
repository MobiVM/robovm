// DefaultHandler2.java - extended DefaultHandler
// http://www.saxproject.org
// Public Domain: no warranty.
// $Id: DefaultHandler2.java,v 1.3 2002/01/12 19:04:19 dbrownell Exp $

package org.xml.sax.ext;

import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * This class extends the SAX2 base handler class to support the
 * SAX2 {@link LexicalHandler}, {@link DeclHandler}, and
 * {@link EntityResolver2} extensions.  Except for overriding the
 * original SAX1 {@link DefaultHandler#resolveEntity resolveEntity()}
 * method the added handler methods just return.  Subclassers may
 * override everything on a method-by-method basis.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * </blockquote>
 *
 * <p> <em>Note:</em> this class might yet learn that the
 * <em>ContentHandler.setDocumentLocator()</em> call might be passed a
 * {@link Locator2} object, and that the
 * <em>ContentHandler.startElement()</em> call might be passed a
 * {@link Attributes2} object.
 *
 * @since SAX 2.0 (extensions 1.1 alpha)
 * @author David Brownell
 * @version TBS
 */
public class DefaultHandler2 extends DefaultHandler
    implements LexicalHandler, DeclHandler, EntityResolver2
{
    /** Constructs a handler which ignores all parsing events. */
    public DefaultHandler2 () { }


    // SAX2 ext-1.0 LexicalHandler

    public void startCDATA ()
    throws SAXException
    {}

    public void endCDATA ()
    throws SAXException
    {}

    public void startDTD (String name, String publicId, String systemId)
    throws SAXException
    {}

    public void endDTD ()
    throws SAXException
    {}

    public void startEntity (String name)
    throws SAXException
    {}

    public void endEntity (String name)
    throws SAXException
    {}

    public void comment (char ch [], int start, int length)
    throws SAXException
    { }


    // SAX2 ext-1.0 DeclHandler

    public void attributeDecl (String eName, String aName,
        String type, String mode, String value)
    throws SAXException
    {}

    public void elementDecl (String name, String model)
    throws SAXException
    {}

    public void externalEntityDecl (String name,
        String publicId, String systemId)
    throws SAXException
    {}

    public void internalEntityDecl (String name, String value)
    throws SAXException
    {}

    // SAX2 ext-1.1 EntityResolver2

    /**
     * Tells the parser that if no external subset has been declared
     * in the document text, none should be used.
     *
     * @param name Identifies the document root element.  This name comes
     *    from a DOCTYPE declaration (where available) or from the actual
     *    root element. The parameter is ignored.
     * @param baseURI The document's base URI, serving as an additional
     *    hint for selecting the external subset.  This is always an absolute
     *    URI, unless it is null because the XMLReader was given an InputSource
     *    without one. The parameter is ignored.
     *
     * @return null (always).
     *
     * @exception SAXException Any SAX exception, possibly wrapping
     *    another exception.
     * @exception IOException Probably indicating a failure to create
     *    a new InputStream or Reader, or an illegal URL.
     */
    public InputSource getExternalSubset (String name, String baseURI)
    throws SAXException, IOException
    { return null; }

    /**
     * Tells the parser to resolve the systemId against the baseURI
     * and read the entity text from that resulting absolute URI.
     * Note that because the older
     * {@link DefaultHandler#resolveEntity DefaultHandler.resolveEntity()},
     * method is overridden to call this one, this method may sometimes
     * be invoked with null <em>name</em> and <em>baseURI</em>, and
     * with the <em>systemId</em> already absolutized.
     *
     * @param name Identifies the external entity being resolved.
     *    Either "[dtd]" for the external subset, or a name starting
     *    with "%" to indicate a parameter entity, or else the name of
     *    a general entity.  This is never null when invoked by a SAX2
     *    parser.
     * @param publicId The public identifier of the external entity being
     *    referenced (normalized as required by the XML specification), or
     *    null if none was supplied.
     * @param baseURI The URI with respect to which relative systemIDs
     *    are interpreted.  This is always an absolute URI, unless it is
     *    null (likely because the XMLReader was given an InputSource without
     *  one).  This URI is defined by the XML specification to be the one
     *    associated with the "&lt;" starting the relevant declaration.
     * @param systemId The system identifier of the external entity
     *    being referenced; either a relative or absolute URI.
     *  This is never null when invoked by a SAX2 parser; only declared
     *    entities, and any external subset, are resolved by such parsers.
     *
     * @return An InputSource object describing the new input source.
     *
     * @exception SAXException Any SAX exception, possibly wrapping
     *    another exception.
     * @exception IOException Probably indicating a failure to create
     *    a new InputStream or Reader, or an illegal URL.
     */
    public InputSource resolveEntity (String name, String publicId,
        String baseURI, String systemId)
    throws SAXException, IOException
    { return null; }

    // SAX1 EntityResolver

    /**
     * Invokes
     * {@link EntityResolver2#resolveEntity EntityResolver2.resolveEntity()}
     * with null entity name and base URI.
     * You only need to override that method to use this class.
     *
     * @param publicId The public identifier of the external entity being
     *    referenced (normalized as required by the XML specification), or
     *    null if none was supplied.
     * @param systemId The system identifier of the external entity
     *    being referenced; either a relative or absolute URI.
     *  This is never null when invoked by a SAX2 parser; only declared
     *    entities, and any external subset, are resolved by such parsers.
     *
     * @return An InputSource object describing the new input source.
     *
     * @exception SAXException Any SAX exception, possibly wrapping
     *    another exception.
     * @exception IOException Probably indicating a failure to create
     *    a new InputStream or Reader, or an illegal URL.
     */
    public InputSource resolveEntity (String publicId, String systemId)
    throws SAXException, IOException
    { return resolveEntity (null, publicId, null, systemId); }
}
