package eu.europa.esig.dss.validation.process.bbb.isc;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import eu.europa.esig.dss.jaxb.detailedreport.XmlConstraint;
import eu.europa.esig.dss.jaxb.detailedreport.XmlISC;
import eu.europa.esig.dss.jaxb.detailedreport.XmlStatus;
import eu.europa.esig.dss.jaxb.diagnostic.XmlSignature;
import eu.europa.esig.dss.jaxb.diagnostic.XmlSigningCertificate;
import eu.europa.esig.dss.validation.process.bbb.isc.checks.DigestValueMatchCheck;
import eu.europa.esig.dss.validation.reports.wrapper.SignatureWrapper;
import eu.europa.esig.jaxb.policy.Level;
import eu.europa.esig.jaxb.policy.LevelConstraint;

public class DigestValueMatchCheckTest {

	@Test
	public void digestValueMatchCheckTest() throws Exception {
		XmlSigningCertificate xsc = new XmlSigningCertificate();
		xsc.setDigestValueMatch(true);

		XmlSignature sig = new XmlSignature();
		sig.setSigningCertificate(xsc);

		LevelConstraint constraint = new LevelConstraint();
		constraint.setLevel(Level.FAIL);

		XmlISC result = new XmlISC();
		DigestValueMatchCheck dvmc = new DigestValueMatchCheck(result, new SignatureWrapper(sig), constraint);
		dvmc.execute();

		List<XmlConstraint> constraints = result.getConstraint();
		assertEquals(1, constraints.size());
		assertEquals(XmlStatus.OK, constraints.get(0).getStatus());
	}

	@Test
	public void digestValueNotMatchCheckTest() throws Exception {
		XmlSigningCertificate xsc = new XmlSigningCertificate();
		xsc.setDigestValueMatch(false);

		XmlSignature sig = new XmlSignature();
		sig.setSigningCertificate(xsc);

		LevelConstraint constraint = new LevelConstraint();
		constraint.setLevel(Level.FAIL);

		XmlISC result = new XmlISC();
		DigestValueMatchCheck dvmc = new DigestValueMatchCheck(result, new SignatureWrapper(sig), constraint);
		dvmc.execute();

		List<XmlConstraint> constraints = result.getConstraint();
		assertEquals(1, constraints.size());
		assertEquals(XmlStatus.NOT_OK, constraints.get(0).getStatus());
	}
}
