// XMLReaderFactory.java - factory for creating a new reader.
// http://www.saxproject.org
// Written by David Megginson
// and by David Brownell
// NO WARRANTY!  This class is in the Public Domain.
// $Id: XMLReaderFactory.java,v 1.10 2002/04/22 01:00:13 dbrownell Exp $

package org.xml.sax.helpers;

import dalvik.annotation.compat.UnsupportedAppUsage;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;


/**
 * Factory for creating an XML reader.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This class contains static methods for creating an XML reader
 * from an explicit class name, or based on runtime defaults:</p>
 *
 * <pre>
 * try {
 *   XMLReader myReader = XMLReaderFactory.createXMLReader();
 * } catch (SAXException e) {
 *   System.err.println(e.getMessage());
 * }
 * </pre>
 *
 * <p><strong>Note to Distributions bundled with parsers:</strong>
 * You should modify the implementation of the no-arguments
 * <em>createXMLReader</em> to handle cases where the external
 * configuration mechanisms aren't set up.  That method should do its
 * best to return a parser when one is in the class path, even when
 * nothing bound its class name to <code>org.xml.sax.driver</code> so
 * those configuration mechanisms would see it.</p>
 *
 * @since SAX 2.0
 * @author David Megginson, David Brownell
 * @version 2.0.1 (sax2r2)
 */
final public class XMLReaderFactory
{
    /**
     * Private constructor.
     *
     * <p>This constructor prevents the class from being instantiated.</p>
     */
    private XMLReaderFactory ()
    {
    }

    private static final String property = "org.xml.sax.driver";

    /**
     * Attempt to create an XMLReader from system defaults.
     * In environments which can support it, the name of the XMLReader
     * class is determined by trying each these options in order, and
     * using the first one which succeeds:</p> <ul>
     *
     * <li>If the system property <code>org.xml.sax.driver</code>
     * has a value, that is used as an XMLReader class name. </li>
     *
     * <li>The JAR "Services API" is used to look for a class name
     * in the <em>META-INF/services/org.xml.sax.driver</em> file in
     * jarfiles available to the runtime.</li>
     *
     * <li> SAX parser distributions are strongly encouraged to provide
     * a default XMLReader class name that will take effect only when
     * previous options (on this list) are not successful.</li>
     *
     * <li>Finally, if {@link ParserFactory#makeParser()} can
     * return a system default SAX1 parser, that parser is wrapped in
     * a {@link ParserAdapter}.  (This is a migration aid for SAX1
     * environments, where the <code>org.xml.sax.parser</code> system
     * property will often be usable.) </li>
     *
     * </ul>
     *
     * <p> In environments such as small embedded systems, which can not
     * support that flexibility, other mechanisms to determine the default
     * may be used. </p>
     *
     * <p>Note that many Java environments allow system properties to be
     * initialized on a command line.  This means that <em>in most cases</em>
     * setting a good value for that property ensures that calls to this
     * method will succeed, except when security policies intervene.
     * This will also maximize application portability to older SAX
     * environments, with less robust implementations of this method.
     * </p>
     *
     * @return A new XMLReader.
     * @exception org.xml.sax.SAXException If no default XMLReader class
     *            can be identified and instantiated.
     * @see #createXMLReader(java.lang.String)
     */
    public static XMLReader createXMLReader ()
    throws SAXException
    {
    String        className = null;
    ClassLoader    loader = NewInstance.getClassLoader ();

    // 1. try the JVM-instance-wide system property
    try { className = System.getProperty (property); }
    catch (RuntimeException e) { /* normally fails for applets */ }

    // 2. if that fails, try META-INF/services/
    if (className == null) {
        try {
        String        service = "META-INF/services/" + property;
        InputStream    in;
        BufferedReader    reader;

        if (loader == null)
            in = ClassLoader.getSystemResourceAsStream (service);
        else
            in = loader.getResourceAsStream (service);

        if (in != null) {
            try {
                reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
                className = reader.readLine();
            } finally {
                in.close(); // may throw IOException
            }
        }
        } catch (Exception e) {
        }
    }

    // 3. Distro-specific fallback
    if (className == null) {
// BEGIN DISTRIBUTION-SPECIFIC

        // EXAMPLE:
        // className = "com.example.sax.XmlReader";
        // or a $JAVA_HOME/jre/lib/*properties setting...

// END DISTRIBUTION-SPECIFIC
    }

    // do we know the XMLReader implementation class yet?
    if (className != null)
        return loadClass (loader, className);

    // 4. panic -- adapt any SAX1 parser
    try {
        return new ParserAdapter (ParserFactory.makeParser ());
    } catch (Exception e) {
        throw new SAXException ("Can't create default XMLReader; "
            + "is system property org.xml.sax.driver set?");
    }
    }


    /**
     * Attempt to create an XML reader from a class name.
     *
     * <p>Given a class name, this method attempts to load
     * and instantiate the class as an XML reader.</p>
     *
     * @param className the name of the class that should be instantiated.
     *
     * <p>Note that this method will not be usable in environments where
     * the caller (perhaps an applet) is not permitted to load classes
     * dynamically.</p>
     *
     * @return A new XML reader.
     * @exception org.xml.sax.SAXException If the class cannot be
     *            loaded, instantiated, and cast to XMLReader.
     * @see #createXMLReader()
     */
    public static XMLReader createXMLReader (String className)
    throws SAXException
    {
    return loadClass (NewInstance.getClassLoader (), className);
    }

    @UnsupportedAppUsage
    private static XMLReader loadClass (ClassLoader loader, String className)
    throws SAXException
    {
    try {
        return (XMLReader) NewInstance.newInstance (loader, className);
    } catch (ClassNotFoundException e1) {
        throw new SAXException("SAX2 driver class " + className +
                   " not found", e1);
    } catch (IllegalAccessException e2) {
        throw new SAXException("SAX2 driver class " + className +
                   " found but cannot be loaded", e2);
    } catch (InstantiationException e3) {
        throw new SAXException("SAX2 driver class " + className +
       " loaded but cannot be instantiated (no empty public constructor?)",
                   e3);
    } catch (ClassCastException e4) {
        throw new SAXException("SAX2 driver class " + className +
                   " does not implement XMLReader", e4);
    }
    }
}
