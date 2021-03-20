package nu.redpois0n.oslib.bsd;

import nu.redpois0n.oslib.Arch;
import nu.redpois0n.oslib.OperatingSystem;
import nu.redpois0n.oslib.UnixOperatingSystem;
import nu.redpois0n.oslib.linux.LinuxDetector;

import java.io.Serializable;

public class BSDOperatingSystem extends UnixOperatingSystem implements Serializable {

    private static final long serialVersionUID = 3409615002184682276L;

    private final Flavor flavor;

    public BSDOperatingSystem(Flavor flavor, Arch arch) {
        super(OperatingSystem.BSD, arch);
        this.flavor = flavor;
    }

    public BSDOperatingSystem() {
        this(Flavor.getLocalFlavor(), LinuxDetector.getLinuxArch());
    }

    public BSDOperatingSystem(Flavor flavor) {
        this(flavor, LinuxDetector.getLinuxArch());
    }

    public Flavor getFlavor() {
        return this.flavor;
    }

    @Override
    public String getDisplayString() {
        return flavor.getName();
    }

}
