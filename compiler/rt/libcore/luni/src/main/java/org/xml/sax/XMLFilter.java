// XMLFilter.java - filter SAX2 events.
// http://www.saxproject.org
// Written by David Megginson
// NO WARRANTY!  This class is in the Public Domain.
// $Id: XMLFilter.java,v 1.6 2002/01/30 21:13:48 dbrownell Exp $

package org.xml.sax;


/**
 * Interface for an XML filter.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>An XML filter is like an XML reader, except that it obtains its
 * events from another XML reader rather than a primary source like
 * an XML document or database.  Filters can modify a stream of
 * events as they pass on to the final application.</p>
 *
 * <p>The XMLFilterImpl helper class provides a convenient base
 * for creating SAX2 filters, by passing on all {@link org.xml.sax.EntityResolver
 * EntityResolver}, {@link org.xml.sax.DTDHandler DTDHandler},
 * {@link org.xml.sax.ContentHandler ContentHandler} and {@link org.xml.sax.ErrorHandler
 * ErrorHandler} events automatically.</p>
 *
 * @since SAX 2.0
 * @author David Megginson
 * @version 2.0.1 (sax2r2)
 * @see org.xml.sax.helpers.XMLFilterImpl
 */
public interface XMLFilter extends XMLReader
{

    /**
     * Set the parent reader.
     *
     * <p>This method allows the application to link the filter to
     * a parent reader (which may be another filter).  The argument
     * may not be null.</p>
     *
     * @param parent The parent reader.
     */
    public abstract void setParent (XMLReader parent);


    /**
     * Get the parent reader.
     *
     * <p>This method allows the application to query the parent
     * reader (which may be another filter).  It is generally a
     * bad idea to perform any operations on the parent reader
     * directly: they should all pass through this filter.</p>
     *
     * @return The parent filter, or null if none has been set.
     */
    public abstract XMLReader getParent ();

}

// end of XMLFilter.java
