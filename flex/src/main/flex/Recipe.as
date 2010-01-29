package
{
	[Bindable]
	[RemoteClass(alias="com.jacobheric.youbrew.domain.Recipe")]
	public class Recipe
	{
		public var id:int;
		public var name:String;
		public var start:Date;
		public var end:Date;
		public var brewNotes:String;
		public var tasteNotes:String;
		public var yeast:Yeast;
	}
}