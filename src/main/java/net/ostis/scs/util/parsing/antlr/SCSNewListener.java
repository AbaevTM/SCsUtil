// Generated from /media/timur/EE286A072869CEE1/Work/SC/SCSTranslator/Grammars/scsNew.g4 by ANTLR 4.1
package net.ostis.scs.util.parsing.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SCSNewParser}.
 */
public interface SCSNewListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SCSNewParser#idtf}.
	 * @param ctx the parse tree
	 */
	void enterIdtf(@NotNull SCSNewParser.IdtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#idtf}.
	 * @param ctx the parse tree
	 */
	void exitIdtf(@NotNull SCSNewParser.IdtfContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#idtf_tuple}.
	 * @param ctx the parse tree
	 */
	void enterIdtf_tuple(@NotNull SCSNewParser.Idtf_tupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#idtf_tuple}.
	 * @param ctx the parse tree
	 */
	void exitIdtf_tuple(@NotNull SCSNewParser.Idtf_tupleContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#attrs_list}.
	 * @param ctx the parse tree
	 */
	void enterAttrs_list(@NotNull SCSNewParser.Attrs_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#attrs_list}.
	 * @param ctx the parse tree
	 */
	void exitAttrs_list(@NotNull SCSNewParser.Attrs_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#sentence_level1}.
	 * @param ctx the parse tree
	 */
	void enterSentence_level1(@NotNull SCSNewParser.Sentence_level1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#sentence_level1}.
	 * @param ctx the parse tree
	 */
	void exitSentence_level1(@NotNull SCSNewParser.Sentence_level1Context ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull SCSNewParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull SCSNewParser.SentenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#sentence_internal_list}.
	 * @param ctx the parse tree
	 */
	void enterSentence_internal_list(@NotNull SCSNewParser.Sentence_internal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#sentence_internal_list}.
	 * @param ctx the parse tree
	 */
	void exitSentence_internal_list(@NotNull SCSNewParser.Sentence_internal_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#attrs_idtf_list}.
	 * @param ctx the parse tree
	 */
	void enterAttrs_idtf_list(@NotNull SCSNewParser.Attrs_idtf_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#attrs_idtf_list}.
	 * @param ctx the parse tree
	 */
	void exitAttrs_idtf_list(@NotNull SCSNewParser.Attrs_idtf_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#idtf_level1}.
	 * @param ctx the parse tree
	 */
	void enterIdtf_level1(@NotNull SCSNewParser.Idtf_level1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#idtf_level1}.
	 * @param ctx the parse tree
	 */
	void exitIdtf_level1(@NotNull SCSNewParser.Idtf_level1Context ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#sentence_level2_6}.
	 * @param ctx the parse tree
	 */
	void enterSentence_level2_6(@NotNull SCSNewParser.Sentence_level2_6Context ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#sentence_level2_6}.
	 * @param ctx the parse tree
	 */
	void exitSentence_level2_6(@NotNull SCSNewParser.Sentence_level2_6Context ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#syntax}.
	 * @param ctx the parse tree
	 */
	void enterSyntax(@NotNull SCSNewParser.SyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#syntax}.
	 * @param ctx the parse tree
	 */
	void exitSyntax(@NotNull SCSNewParser.SyntaxContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#sentence_internal}.
	 * @param ctx the parse tree
	 */
	void enterSentence_internal(@NotNull SCSNewParser.Sentence_internalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#sentence_internal}.
	 * @param ctx the parse tree
	 */
	void exitSentence_internal(@NotNull SCSNewParser.Sentence_internalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#attr_sep}.
	 * @param ctx the parse tree
	 */
	void enterAttr_sep(@NotNull SCSNewParser.Attr_sepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#attr_sep}.
	 * @param ctx the parse tree
	 */
	void exitAttr_sep(@NotNull SCSNewParser.Attr_sepContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#idtf_edge}.
	 * @param ctx the parse tree
	 */
	void enterIdtf_edge(@NotNull SCSNewParser.Idtf_edgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#idtf_edge}.
	 * @param ctx the parse tree
	 */
	void exitIdtf_edge(@NotNull SCSNewParser.Idtf_edgeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#sentence_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSentence_assignment(@NotNull SCSNewParser.Sentence_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#sentence_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSentence_assignment(@NotNull SCSNewParser.Sentence_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#idtf_attrs}.
	 * @param ctx the parse tree
	 */
	void enterIdtf_attrs(@NotNull SCSNewParser.Idtf_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#idtf_attrs}.
	 * @param ctx the parse tree
	 */
	void exitIdtf_attrs(@NotNull SCSNewParser.Idtf_attrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#idtf_set}.
	 * @param ctx the parse tree
	 */
	void enterIdtf_set(@NotNull SCSNewParser.Idtf_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#idtf_set}.
	 * @param ctx the parse tree
	 */
	void exitIdtf_set(@NotNull SCSNewParser.Idtf_setContext ctx);

	/**
	 * Enter a parse tree produced by {@link SCSNewParser#idtf_internal}.
	 * @param ctx the parse tree
	 */
	void enterIdtf_internal(@NotNull SCSNewParser.Idtf_internalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCSNewParser#idtf_internal}.
	 * @param ctx the parse tree
	 */
	void exitIdtf_internal(@NotNull SCSNewParser.Idtf_internalContext ctx);
}