import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true) //игнорирования неизвестных полей в JSON при десериализации в Object
public class Issue {
    public String Id;
    public String RecordCreated;
    public String RecordModified;
    public String OrderNum;
    public String Caption;
    public String Description;
    public String Priority;
    public String Author;
    public String Function;
    public String Estimation;
    public String Owner;
    public String Type;
    public String PlannedRelease;
    public String Environment;
    public String SubmittedVersion;
    public String ClosedInVersion;
    public String State;
    public String Completed;
    public String StartDate;
    public String FinishDate;
    public String EstimationLeft;
    public String DeliveryDate;
    public String Severity;
    public String TimesRepeated;
    public String ExternalId;
    public String Fact;
    public String Iteration;
    public String EstimatedStartDate;
    public String EstimatedFinishDate;
    public String FactToday;
    public String Feedback;
    public String FeedbackText;
    public String LastTransition;
//    public String StateDuration;
//    public String LeadTime;
    public String Watchers;
    public String Tags;
    public String Question;
    public String Tasks;
    public String OpenTasks;
    public String DueWeeks;
    public String Deadlines;
    public String Links;
    public String Components;
    public String BlockReason;
    public String Requirement;
    public String RequirementDocument;
    public String SourceCode;
    public String TestScenario;
    public String TestFound;
    public String TestExecution;
    public String HelpPage;
    public String Company;
    public String SupportChannelName;
    public String ArtefactReviewers;
    public String IntegrationLink;
    public String CostPlanned;
    public String CostFact;
    public String UID;
    public String URL;
    public String ProjectCodeName;
    public String self;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return Objects.equals(Id, issue.Id) && Objects.equals(RecordCreated, issue.RecordCreated) && Objects.equals(RecordModified, issue.RecordModified) && Objects.equals(OrderNum, issue.OrderNum) && Objects.equals(Caption, issue.Caption) && Objects.equals(Description, issue.Description) && Objects.equals(Priority, issue.Priority) && Objects.equals(Author, issue.Author) && Objects.equals(Function, issue.Function) && Objects.equals(Estimation, issue.Estimation) && Objects.equals(Owner, issue.Owner) && Objects.equals(Type, issue.Type) && Objects.equals(PlannedRelease, issue.PlannedRelease) && Objects.equals(Environment, issue.Environment) && Objects.equals(SubmittedVersion, issue.SubmittedVersion) && Objects.equals(ClosedInVersion, issue.ClosedInVersion) && Objects.equals(State, issue.State) && Objects.equals(Completed, issue.Completed) && Objects.equals(StartDate, issue.StartDate) && Objects.equals(FinishDate, issue.FinishDate) && Objects.equals(EstimationLeft, issue.EstimationLeft) && Objects.equals(DeliveryDate, issue.DeliveryDate) && Objects.equals(Severity, issue.Severity) && Objects.equals(TimesRepeated, issue.TimesRepeated) && Objects.equals(ExternalId, issue.ExternalId) && Objects.equals(Fact, issue.Fact) && Objects.equals(Iteration, issue.Iteration) && Objects.equals(EstimatedStartDate, issue.EstimatedStartDate) && Objects.equals(EstimatedFinishDate, issue.EstimatedFinishDate) && Objects.equals(FactToday, issue.FactToday) && Objects.equals(Feedback, issue.Feedback) && Objects.equals(FeedbackText, issue.FeedbackText) && Objects.equals(LastTransition, issue.LastTransition) && Objects.equals(Watchers, issue.Watchers) && Objects.equals(Tags, issue.Tags) && Objects.equals(Question, issue.Question) && Objects.equals(Tasks, issue.Tasks) && Objects.equals(OpenTasks, issue.OpenTasks) && Objects.equals(DueWeeks, issue.DueWeeks) && Objects.equals(Deadlines, issue.Deadlines) && Objects.equals(Links, issue.Links) && Objects.equals(Components, issue.Components) && Objects.equals(BlockReason, issue.BlockReason) && Objects.equals(Requirement, issue.Requirement) && Objects.equals(RequirementDocument, issue.RequirementDocument) && Objects.equals(SourceCode, issue.SourceCode) && Objects.equals(TestScenario, issue.TestScenario) && Objects.equals(TestFound, issue.TestFound) && Objects.equals(TestExecution, issue.TestExecution) && Objects.equals(HelpPage, issue.HelpPage) && Objects.equals(Company, issue.Company) && Objects.equals(SupportChannelName, issue.SupportChannelName) && Objects.equals(ArtefactReviewers, issue.ArtefactReviewers) && Objects.equals(IntegrationLink, issue.IntegrationLink) && Objects.equals(CostPlanned, issue.CostPlanned) && Objects.equals(CostFact, issue.CostFact) && Objects.equals(UID, issue.UID) && Objects.equals(URL, issue.URL) && Objects.equals(ProjectCodeName, issue.ProjectCodeName) && Objects.equals(self, issue.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, RecordCreated, RecordModified, OrderNum, Caption, Description, Priority, Author, Function, Estimation, Owner, Type, PlannedRelease, Environment, SubmittedVersion, ClosedInVersion, State, Completed, StartDate, FinishDate, EstimationLeft, DeliveryDate, Severity, TimesRepeated, ExternalId, Fact, Iteration, EstimatedStartDate, EstimatedFinishDate, FactToday, Feedback, FeedbackText, LastTransition, Watchers, Tags, Question, Tasks, OpenTasks, DueWeeks, Deadlines, Links, Components, BlockReason, Requirement, RequirementDocument, SourceCode, TestScenario, TestFound, TestExecution, HelpPage, Company, SupportChannelName, ArtefactReviewers, IntegrationLink, CostPlanned, CostFact, UID, URL, ProjectCodeName, self);
    }
}