package analyzer.exercises.leap;

import analyzer.Comment;
import analyzer.CommentType;

/**
 * @see <a href="https://github.com/exercism/website-copy/blob/main/analyzer-comments/java/leap/avoid_conditional_logic.md">Markdown Template</a>
 */
class AvoidConditionalLogic extends Comment {
    @Override
    public String getKey() {
        return "java.leap.avoid_conditional_logic";
    }

    @Override
    public CommentType getType() {
        return CommentType.ACTIONABLE;
    }
}
