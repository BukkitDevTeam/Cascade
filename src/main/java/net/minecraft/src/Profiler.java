package net.minecraft.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Cascade: This class must be stripped entirely.
 */
public class Profiler {

    /** List of parent sections */
    private final List sectionList = new ArrayList();

    /** List of timestamps (System.nanoTime) */
    private final List timestampList = new ArrayList();

    /** Flag profiling enabled */
    public boolean profilingEnabled = false;

    /** Current profiling section */
    private String profilingSection = "";

    /** Profiling map */
    private final Map profilingMap = new HashMap();

    /**
     * Clear profiling.
     */
    public void clearProfiling() {
    }

    /**
     * Start section
     */
    public void startSection(String par1Str) {
    }

    /**
     * End section
     */
    public void endSection() {
    }

    /**
     * Get profiling data
     */
    public List getProfilingData(String par1Str) {
        return null;
    }

    /**
     * End current section and start a new section
     */
    public void endStartSection(String par1Str) {
    }

    public String func_76322_c() {
        return null;
    }
}
