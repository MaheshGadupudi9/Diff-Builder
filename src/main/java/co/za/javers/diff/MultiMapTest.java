package co.za.javers.diff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class MultiMapTest {
    public static void main(String[] args) {

        final HashMap<DocumentCategory, HashMap<DocumentGroup, List<DocumentType>>> clientMap   = new HashMap<>();

        clientMap.put(DocumentCategory.Person,new HashMap<>());
        clientMap.put(DocumentCategory.Entity,new HashMap<>());
        clientMap.put(DocumentCategory.Authority,new HashMap<>());

        final HashMap<DocumentGroup, List<DocumentType>> personMap = clientMap.get(DocumentCategory.Person);

        final ArrayList<DocumentType> individual = new ArrayList<>();
        individual.add(DocumentType.NationalId);
        individual.add(DocumentType.NationalDriveLicence);
        personMap.put(DocumentGroup.Individual,individual);

        final ArrayList<DocumentType> foreign = new ArrayList<>();
        foreign.add(DocumentType.Passport);
        personMap.put(DocumentGroup.Foreign,foreign);

        final ArrayList<DocumentType> birth = new ArrayList<>();
        foreign.add(DocumentType.BirthCertificate);
        personMap.put(DocumentGroup.BirthCertificate,birth);

        final HashMap<DocumentGroup, List<DocumentType>> entityMap = clientMap.get(DocumentCategory.Entity);

        final ArrayList<DocumentType> organization = new ArrayList<>();
        organization.add(DocumentType.CORP_REG);
        organization.add(DocumentType.TAX_REG_CERT);
        entityMap.put(DocumentGroup.Organization,organization);

        final HashMap<DocumentGroup, List<DocumentType>> authorityMap = clientMap.get(DocumentCategory.Authority);

        final ArrayList<DocumentType> authorities = new ArrayList<>();
        authorities.add(DocumentType.CORP_REG);
        authorities.add(DocumentType.TAX_REG_CERT);
        authorityMap.put(DocumentGroup.Organization,authorities);

        System.out.println("clientMap = " + clientMap);

    }
}
//level 1
enum DocumentCategory {
    Person,Entity,Authority
}
// level 2
enum DocumentGroup {
    Individual(DocumentCategory.Person),
    Foreign(DocumentCategory.Person),
    BirthCertificate(DocumentCategory.Person),
    Authority(DocumentCategory.Authority),
    Organization(DocumentCategory.Entity);
    private final DocumentCategory documentCategory;
    DocumentGroup(DocumentCategory documentCategory) {
        this.documentCategory = documentCategory;
    }
}
// level 3
enum DocumentType{
    NationalId(DocumentGroup.Individual,"National Id"),
    NationalDriveLicence(DocumentGroup.Individual,"National driver licence"),
    Passport(DocumentGroup.Foreign,"National Passport"),
    BirthCertificate(DocumentGroup.Individual,"National Birth Certificate"),
    CORP_REG(DocumentGroup.Organization,"Corporation Registration"),
    TAX_REG_CERT(DocumentGroup.Organization,"Tax Registration Certificate"),
    PowerOfAttorney(DocumentGroup.Authority,"Power of Attorney Letter");

    private final DocumentGroup documentGroup;
    private final String name;
    DocumentType(DocumentGroup documentGroup, String name) {
        this.documentGroup = documentGroup;
        this.name = name;
    }
}
